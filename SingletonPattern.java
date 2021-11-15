class pattern{
  
  class SingleTonTest{
    
    static singleTonTest=new SingleTonTest();
    private SingleTonTest(){
    }
    
    public static SingleTonTest getInstance()
    {
      return singleTonTest;
    }
    
       
    
  }
  }
