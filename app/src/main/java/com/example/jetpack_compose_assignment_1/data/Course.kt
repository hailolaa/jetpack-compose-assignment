
package com.example.jetpack_compose_assignment_1.data

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
)

fun sampleCourses() = listOf(
    Course("Mobile App Dev", "CS302", 3, "Learn Android with Jetpack Compose.", "Intro to Programming"),
    Course("Algorithms", "CS210", 4, "Explore algorithm design and problem solving.", "Data Structures"),
    Course("Networks", "CS305", 3, "Understand network protocols and architecture.", "Operating Systems"),
    Course("Database Systems", "CS220", 3, "Introduction to relational databases and SQL.", "Intro to Programming"),
    Course("Operating Systems", "CS301", 4, "Learn about memory, processes, and file systems.", "Computer Architecture"),
    Course("Web Development", "CS330", 3, "Frontend and backend web technologies.", "Intro to Programming"),
    Course("Software Engineering", "CS340", 3, "Principles of software design and development.", "Data Structures"),
    Course("Artificial Intelligence", "CS360", 4, "Intro to AI techniques like search, logic, and learning.", "Algorithms"),
    Course("Computer Graphics", "CS370", 3, "Rendering, modeling, and graphics pipelines.", "Linear Algebra"),
    Course("Cybersecurity Fundamentals", "CS380", 3, "Basics of digital security, threats, and mitigation.", "Operating Systems")

)
