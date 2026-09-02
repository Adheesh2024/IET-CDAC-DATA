class Calculator{
    public static void main(String[] args){
				int ans=0;
           System.out.println("Length: "+args.length);
				if(args.length<3){
               System.out.println("Too few parameters give 3 parameters ");
				}else{
                 switch(args[0]){
						case "+":
                    ans=Integer.parseInt(args[1])+Integer.parseInt(args[2]); 
							 System.out.println("Addition:"+ans);
							break;
						case "-":
			    			 ans=Integer.parseInt(args[1])-Integer.parseInt(args[2]); 
							 System.out.println("Subtraction :"+ans);
							 break;   
						case "x":
			    			 ans=Integer.parseInt(args[1])*Integer.parseInt(args[2]); 
							 System.out.println("Multiplication :"+ans);
							 break; 
						case "/":
			    			 ans=Integer.parseInt(args[1])/Integer.parseInt(args[2]); 
							 System.out.println("Division :"+ans);
							 break; 
							default : 
								System.out.println("Default ");
						}
                 
                 
                 switch(args[0]){
					case "+"->{
             ans=Integer.parseInt(args[1])+Integer.parseInt(args[2]); 
						 System.out.println("Addition:"+ans);
					}
					case "-"->{
		    			 ans=Integer.parseInt(args[1])-Integer.parseInt(args[2]); 
						 System.out.println("Subtraction :"+ans);
					}
					case "x"->{
		    			 ans=Integer.parseInt(args[1])*Integer.parseInt(args[2]); 
						 System.out.println("Multiplication :"+ans);
					}
					case "/" ->{
		    			 ans=Integer.parseInt(args[1])/Integer.parseInt(args[2]); 
						 System.out.println("Division :"+ans);
					}
                 }
						

				}
           
			  
				
    }

}