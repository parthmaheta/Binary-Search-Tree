package myCollection;
public class BST{
 Node Root=null;
 
 public Node getRoot()
 {
	 return Root;
 }
 public void insert(int N)
 { 
   Node Obj=Root;
   
    if(Root==null)
      Root=new Node(N);
    else
      while(true)   
	  {
	      if(N>Obj.Data)
		   { 
		     if(Obj.Right!=null)
		      { Obj=Obj.Right;}
			 
		     else
               {
			    Obj.Right=new Node(N);
                break;
               }				
		   }
		   
		  else
           {		  
		     if(Obj.Left!=null)
			  Obj=Obj.Left;
			 else
			  {
			    Obj.Left=new Node(N);
				break;
			  } 
		   }
	  }
  } //end insert method 
  
  public void delete(int N)
  {
    Root=delete(N,Root);
  }
  private Node delete(int N,Node root)
  {
     if(root==null)
	  System.out.println("not found");
	 else if(root.Data==N)
       {
	    if((root.Left==null) && (root.Right==null))
		  return null;
		else if((root.Left!=null) && (root.Right==null))
		  return root.Left;
		else if((root.Right!=null) && (root.Left==null))
		  return root.Right;
		else
         {
		   root.Data=findMin(root.Right);
		   root.Right=delete(root.Data,root.Right);
		  }		   
	    }
     else if(root.Data>N)
       root.Left=delete(N,root.Left);
     else if(root.Data<N)
       root.Right=delete(N,root.Right);	  
         
		 return root; 
  }// end private delete
 
	public int findMin(Node root)
	{
		if(root.Left==null)
		 return root.Data;
		else
		  return findMin(root.Left);
				  
	} 
  public int findMax(Node root)
	{
		if(root.Right==null)
		 return root.Data;
		else
		  return findMax(root.Right);
   }
	public void findPathTo(int N)
	{
		 Node root=Root;
		while(root!=null)
		{
			System.out.print(root.Data+",");
			 
			if(root.Data<N)
				root=root.Right; 
			else if(root.Data>N)
				root=root.Left;
			else if(root.Data==N)
				return ;
		}
		System.out.println("Sorry Not Found");
	} //end findPathTO
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
		 inOrder(root.Left);
		 System.out.print(root.Data+",");
		 inOrder(root.Right);
		}
	}
  
}//end BST