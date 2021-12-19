package com.example.hybrid_quiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1 = Question(
                1,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Australia",
                "Armenia",
                "Austria",
                1
        )
        questionsList.add(que1)

        val que2 = Question(
                2,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Brazil",
                "Austria",
                "Australia",
                "Kuwait",
                3
        )
        questionsList.add(que2)

        val que3 = Question(
                3,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_belgium,
                "Argentina",
                "Australia",
                "Armenia",
                "Belgium",
                4
        )
        questionsList.add(que3)

        val que4 = Question(
                4,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Argentina",
                "Brazil",
                "Bangladesh",
                "Pakistan",
                2
        )
        questionsList.add(que4)

        val que5 = Question(
                5,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Switzerland",
                "Denmark",
                "Armenia",
                "Austria",
                2
        )
        questionsList.add(que5)

        val que6 = Question(
                6,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_fiji,
                "Fiji",
                "Australia",
                "Armenia",
                "Austria",
                1
        )
        questionsList.add(que6)

        val que7 = Question(
                7,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_germany,
                "Argentina",
                "Australia",
                "Armenia",
                "Germany",
                4
        )
        questionsList.add(que7)

        val que8 = Question(
                8,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_india,
                "Srilanka",
                "England",
                "India",
                "Austria",
                3
        )
        questionsList.add(que8)

        val que9 = Question(
                9,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                "Kuwait",
                "Australia",
                "Armenia",
                "Austria",
                1
        )
        questionsList.add(que9)

        val que10 = Question(
                10,
                "What country does this Flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                "Argentina",
                "New Zealand",
                "Armenia",
                "Austria",
                1
        )
        questionsList.add(que10)

        return questionsList
    }

    fun getQuestions2(): ArrayList<Question> {
        val questionsList2 = ArrayList<Question>()
        val que1 = Question(
                1,
                "Kotlin is developed by?",
                R.drawable.kotlin_domain,
                "Google",
                "Microsoft",
                "JetBrains",
                "Adobe",
                3
        )
        questionsList2.add(que1)

        val que2 = Question(
                2,
                "Which of the following is used to handle null exceptions in Kotlin?",
                R.drawable.kotlin_domain,
                "Range",
                "Elvis Operator",
                "Sealed Class",
                "Lambda function",
                2
        )
        questionsList2.add(que2)

        val que3 = Question(
                3,
                "All classes in Kotlin are by default?",
                R.drawable.kotlin_domain,
                "final",
                "public",
                "sealed",
                "abstract",
                1
        )
        questionsList2.add(que3)

        val que4 = Question(
                4,
                "What is correct way to create Array-list in Kotlin?",
                R.drawable.kotlin_domain,
                "hashSetOf(1, 2, 3)",
                "arrayList(1, 2, 3)",
                "hashSet(1, 2, 3)",
                "arrayListOf(1, 2, 3)",
                4
        )
        questionsList2.add(que4)

        val que5 = Question(
                5,
                "How do you get length of the string in Kotlin?",
                R.drawable.kotlin_domain,
                "str.length",
                "length(str)",
                "lengthOf(str)",
                "str.lengthOf",
                1
        )
        questionsList2.add(que5)

        val que6 = Question(
                6,
                "Which of the following is not the basic data-type in Kotlin?",
                R.drawable.kotlin_domain,
                "Numbers",
                "Strings",
                "Arrays",
                "Lists",
                4
        )
        questionsList2.add(que6)

        val que7 = Question(
                7,
                "Which of the following is not a keyword in Kotlin?",
                R.drawable.kotlin_domain,
                "null",
                "var",
                "val",
                "True",
                4
        )
        questionsList2.add(que7)

        val que8 = Question(
                8,
                "Which of the following constructors are available in Kotlin?",
                R.drawable.kotlin_domain,
                "Primary",
                "Secondary",
                "Both 1 & 2",
                "None of the above",
                3
        )
        questionsList2.add(que8)

        val que9 = Question(
                9,
                "Which file extension is used to save Kotlin files?",
                R.drawable.kotlin_domain,
                ".kt or .kts",
                ".java",
                ".kot",
                ".android",
                1
        )
        questionsList2.add(que9)

        val que10 = Question(
                10,
                "How to make multi-lined comment in Kotlin?",
                R.drawable.kotlin_domain,
                "// xyz",
                "/* xyz */",
                "/ xyz /",
                "# xyz",
                3
        )
        questionsList2.add(que10)

        return questionsList2
    }

    fun getQuestions3(): ArrayList<Question> {
        val questionsList3 = ArrayList<Question>()
        val que1 = Question(
                1,
                "How can you create an e-mail link?",
                R.drawable.webdev_domain,
                "<mail href=\"a@b\">",
                "<mail>a@b</mail>",
                "<a href=\"a@b\">",
                "<a href=\"mailto:a@b.com\">",
                4
        )
        questionsList3.add(que1)

        val que2 = Question(
                2,
                "How can you open a link in a new browser window?",
            R.drawable.webdev_domain,
                "<a href=\"url\" new>",
                "<a href=\"url\" target=\"new\">",
                "<a href=\"url\" target=\"_blank\">",
                "<a href=\"url\" target=\"\">",
                3
        )
        questionsList3.add(que2)

        val que3 = Question(
                3,
                "Which of these tags are all <table> tags?",
            R.drawable.webdev_domain,
                "<table><head><tfoot>",
                "<table><tr><td>",
                "<table><tr><tt>",
                "<thead><body><tr>",
                2
        )
        questionsList3.add(que3)

        val que4 = Question(
                4,
                "Which of the following JavaScript cannot do?",
            R.drawable.webdev_domain,
                "JavaScript can react to events",
                "JavaScript can manipulate HTML elements",
                "JavaScript can be use to validate data",
                "None of the above",
                4
        )
        questionsList3.add(que4)

        val que5 = Question(
                5,
                "Which is not a property of attribute Behaviour of <Marquee> tag?",
            R.drawable.webdev_domain,
                "alternate",
                "blur",
                "scroll",
                "slide",
                2
        )
        questionsList3.add(que5)

        val que6 = Question(
                6,
                "Which of the following is not the basic data-type in Kotlin?",
            R.drawable.webdev_domain,
                "Numbers",
                "Strings",
                "Arrays",
                "Lists",
                4
        )
        questionsList3.add(que6)

        val que7 = Question(
                7,
                "Which of the following is not a keyword in Kotlin?",
            R.drawable.webdev_domain,
                "null",
                "var",
                "val",
                "True",
                4
        )
        questionsList3.add(que7)

        val que8 = Question(
                8,
                "Which of the following constructors are available in Kotlin?",
            R.drawable.webdev_domain,
                "Primary",
                "Secondary",
                "Both 1 & 2",
                "None of the above",
                3
        )
        questionsList3.add(que8)

        val que9 = Question(
                9,
                "Which file extension is used to save Kotlin files?",
            R.drawable.webdev_domain,
                ".kt or .kts",
                ".java",
                ".kot",
                ".android",
                1
        )
        questionsList3.add(que9)

        val que10 = Question(
                10,
                "How to make multi-lined comment in Kotlin?",
            R.drawable.webdev_domain,
                "// xyz",
                "/* xyz */",
                "/ xyz /",
                "# xyz",
                3
        )
        questionsList3.add(que10)

        return questionsList3
    }
    fun getQuestions4(): ArrayList<Question> {
        val questionsList4 = ArrayList<Question>()
        val que1 = Question(
                1,
                "In first 10 overs of a cricket game, run rate was 3.2. What should be the run rate in remaining 40 overs to reach target of 282 runs?",
                R.drawable.aptitude_domain,
                "6.25",
                "6.5",
                "6.75",
                "7",
                1
        )
        questionsList4.add(que1)

        val que2 = Question(
                2,
                "The average of 20 numbers is zero. Of them, at the most, how many may be greater than zero?",
            R.drawable.aptitude_domain,
                "0",
                "20",
                "1",
                "10",
                1
        )
        questionsList4.add(que2)

        val que3 = Question(
                3,
                "A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:",
            R.drawable.aptitude_domain,
                "45 km/hr",
                "50 km/hr",
                "60 km/hr",
                "55 km/hr",
                2
        )
        questionsList4.add(que3)

        val que4 = Question(
                4,
                "A can do a work in 15 days and B in 20 days. If they work on it together for 4 days, then the fraction of the work that is left is :",
            R.drawable.aptitude_domain,
                "1/4",
                "7/15",
                "3/2",
                "8/15",
                4
        )
        questionsList4.add(que4)

        val que5 = Question(
                5,
                "A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is?",
            R.drawable.aptitude_domain,
                "650",
                "690",
                "698",
                "700",
                3
        )
        questionsList4.add(que5)

        val que6 = Question(
                6,
                "Two numbers are respectively 20% and 50% more than a third number. The ratio of the two numbers is?",
                R.drawable.aptitude_domain,
                "2:5",
                "3:5",
                "5:7",
                "4:5",
                4
        )
        questionsList4.add(que6)

        val que7 = Question(
                7,
                "A clock is started at noon. By 10 minutes past 5, the hour hand has turned through?",
                R.drawable.aptitude_domain,
                "165 degrees",
                "155 degrees",
                "180 degrees",
                "90 degrees",
                2
        )
        questionsList4.add(que7)

        val que8 = Question(
                8,
                "The compound interest on Rs. 30,000 at 7% per annum is Rs. 4347. The period (in years) is?",
            R.drawable.aptitude_domain,
                "2",
                "2.5",
                "3",
                "4",
                1
        )
        questionsList4.add(que8)

        val que9 = Question(
                9,
                "The percentage increase in the area of a rectangle, if each of its sides is increased by 20% is?",
            R.drawable.aptitude_domain,
                "40%",
                "45%",
                "44%",
                "60%",
                3
        )
        questionsList4.add(que9)

        val que10 = Question(
                10,
                "Three times the first of three consecutive odd integers is 3 more than twice the third. The third integer is?",
            R.drawable.aptitude_domain,
                "50",
                "20",
                "10",
                "15",
                4
        )
        questionsList4.add(que10)

        return questionsList4
    }
}