package com.example.just7minutes

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val Pranamasana = ExerciseModel(
            1,"Pranamasana",
            R.drawable.img_surya_1,
            false,
            false
        )
        exerciseList.add(Pranamasana)

        val Hasta_Uttanasana = ExerciseModel(
            2,"Hasta Uttanasana",
            R.drawable.img_surya_2,
            false,
            false
        )
        exerciseList.add(Hasta_Uttanasana)

        val Padahastasana = ExerciseModel(
            3,"Padahastasana",
            R.drawable.img_surya_3,
            false,
            false
        )
        exerciseList.add(Padahastasana)

        val Ashwa_Sanchalanasana = ExerciseModel(
            4,"Ashwa Sanchalanasana",
            R.drawable.img_surya_4,
            false,
            false
        )
        exerciseList.add(Ashwa_Sanchalanasana)

        val Adho_Mukha_Svanasana = ExerciseModel(
            5,"Adho Mukha Svanasana",
            R.drawable.img_surya_5,
            false,
            false
        )
        exerciseList.add(Adho_Mukha_Svanasana)

        val Ashtanga_Namaskarasana = ExerciseModel(
            6,"Ashtanga Namaskarasana",
            R.drawable.img_surya_6,
            false,
            false
        )
        exerciseList.add(Ashtanga_Namaskarasana)

        val Bhujangasana = ExerciseModel(
            7,"Bhujangasana",
            R.drawable.img_surya_7,
            false,
            false
        )
        exerciseList.add(Bhujangasana)

        val Adho_Mukha_Svanasana2 = ExerciseModel(
            8,"Adho Mukha Svanasana",
            R.drawable.img_surya_8,
            false,
            false
        )
        exerciseList.add(Adho_Mukha_Svanasana2)

        val Ashwa_Sanchalanasana2 = ExerciseModel(
            9,"Ashwa Sanchalanasana",
            R.drawable.img_surya_9,
            false,
            false
        )
        exerciseList.add(Ashwa_Sanchalanasana2)

        val Hastapadasana = ExerciseModel(
            10,"Hastapadasana",
            R.drawable.img_surya_10,
            false,
            false
        )
        exerciseList.add(Hastapadasana)

        val Hasta_Uttanasana2 = ExerciseModel(
            11,"Hasta Uttanasana",
            R.drawable.img_surya_11,
            false,
            false
        )
        exerciseList.add(Hasta_Uttanasana2)

        val Pranamasana2 = ExerciseModel(
            12,"Pranamasana",
            R.drawable.img_surya_12,
            false,
            false
        )
        exerciseList.add(Pranamasana2)

        return exerciseList
    }

}