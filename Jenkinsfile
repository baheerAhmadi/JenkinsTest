pipeline {
 agent any
   stages{
     stage("build") {
       when {
         expression {
           BRANCH_NAME == 'Dev' || BRANCH_NAME == 'master'
         }
       }
       steps{
         echo " when condition met"
            }
}

 stage("test") {
   
   }
       steps{
          echo "test stage  "
            }
}
 stage("deploy") {

   when{
     expression {
       BRANCH_NAME == "production"
     }

       steps{
          echo "deploy stage Production branch "
            }
}

}
}
