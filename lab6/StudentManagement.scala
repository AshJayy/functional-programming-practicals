import scala.io.StdIn.readLine

object StudentRecords {

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    val studentData = getStudentInfoWithRetry()
    val (name, marks, totalMarks) = studentData
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else {
      try {
        val marksInt = marks.toInt
        val totalMarksInt = totalMarks.toInt
        if (marksInt < 0 || totalMarksInt <= 0) {
          (false, Some("Marks and total marks must be positive integers"))
        } else if (marksInt > totalMarksInt) {
          (false, Some("Marks obtained cannot exceed total possible marks"))
        } else {
          (true, None)
        }
      } catch {
        case _: NumberFormatException => (false, Some("Marks and total marks must be valid integers"))
      }
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int) = {
    var validInput = false
    var studentData: (String, Int, Int) = ("", 0, 0)

    while (!validInput) {
      println("Enter student's name: ")
      val name = readLine()
      println("Enter marks obtained: ")
      val marksStr = readLine()
      println("Enter total possible marks: ")
      val totalMarksStr = readLine()

      val (isValid, errorMessage) = validateInput(name, marksStr, totalMarksStr)
      if (isValid) {
        validInput = true
        studentData = (name, marksStr.toInt, totalMarksStr.toInt)
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}. Please try again.")
      }
    }

    studentData
  }

  def main(args: Array[String]): Unit = {
    val studentRecords = Array.fill(3)(getStudentInfo())
    
    studentRecords.foreach { record =>
      printStudentRecord(record)
      println("-------------")
    }
  }
}
