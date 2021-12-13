package com.example.newproject

object Constants {


    fun getQuestions(): ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val que1 = Questions(1,
            "What class is this?",
            "CIT111",
            "MATH100b",
            "CSE310",
            3

        )
        questionList.add(que1)

        val que2 = Questions(1,
            "What flab this?",
            "CIT111",
            "MATH100b",
            "CSE310",
            3

        )
        questionList.add(que2)

        val que3 = Questions(1,
            "wHAT scholl is this?",
            "CIT111",
            "MATH100b",
            "CSE310",
            3

        )
        questionList.add(que3)


        return questionList
    }

}