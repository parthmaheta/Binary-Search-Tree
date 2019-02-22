import myCollection.BST;
import myCollection.Node;
import java.util.Scanner;
/* 
  Program Name: Binary Search Tree
  Author: Parth Maheta
  Date: 22 feb,2019
  Language: java		  
  Number Of File:3
  Files Name:Main.java,Node.java,BST.java  
  
  Description: Binary Search Tree
  
  Step 1: Compile Main java File Using Command Given Below
           java -d . Node.java    //hit enter
           java -d . BST.java     //hit enter		   
           javac Main.java       //hit enter
		   
  Step2: Run Program		   
          java Main       //hit enter	
      
	  Thank You

 Written With Love.......	   
		   
*/
public class Main{
  public static void main(String[] args)
   {
     Scanner Scan=new Scanner(System.in);
	 int value,Choice=0;
	 Node root=null; 
	 BST bst=new BST();
     	   
	   while(Choice!=-1)
	   {
	     System.out.print("\nEnter Choice \n\t-1 For Exit \n\t 1 For insert \n\t 2 For Delete \n\t 3 For min \n\t4 For max \n\t5.print inorder\n\t6.findpath \n\t Enter Choice:");
		 Choice=Scan.nextInt();
		 
		 switch(Choice)
               {   
			       case -1:
				    System.exit(0);
					
			       case 1:
				     System.out.print("Enter Value:");
					 value=Scan.nextInt();
				     bst.insert(value);
					 root=bst.getRoot();
				   break;
				   
				   case 2:
				     if(root!=null)
				     {System.out.print("Enter Value:");
					 value=Scan.nextInt();
				     bst.delete(value);
					 }
					 break;
					
                   case 3:
				     if(root!=null)
                     System.out.println("min:"+bst.findMin(root));
                     break;

                   case 4:
				     if(root!=null)
                     System.out.println("max:"+bst.findMax(root));
                     break;
                  
				   case 5:
				     if(root!=null)
				     bst.inOrder(root);
				     break;
				
                   case 6:
				   if(root!=null) 
				   {System.out.print("Enter Value:");
				    value=Scan.nextInt();
				    bst.findPathTo(value);
				   }
				   break;
				   
                   default:
                     System.out.println("\t\t\tEnter Proper Choice");   				   
                     				   
               }// end switch
 			   
	   }// end While
	 
   }
}