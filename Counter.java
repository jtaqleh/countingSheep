public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
    
    //Declare final count
    int finalCount = 0;
    
    //First lets loop the array
    for(int i = 0; i < arrayOfSheeps.length; i++){
      System.out.println(arrayOfSheeps[i]); //test completed
      
      //Check to see if the sheep is present & making sure the null condition is also checked
      if(arrayOfSheeps[i] != null && arrayOfSheeps[i] == true){
        finalCount += 1;
      } else{
        //if its null or false, the finalCount should just add zero 
        finalCount += 0;
      }
    }
    
    return finalCount;
  }
}
