import java.util.*;
public class frog{
	public static void main(String[]arg)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int weight[]=new int[n];
		int jump[]=new int[n];
		int count=0;
		int pos[]=new int[n];
		
					for(int i=0;i<n;i++)
		{
			weight[i]=in.nextInt();

		}
		for(int i=0;i<n;i++)
		{
			jump[i]=in.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			pos[i]=i;
			
		}
		int temp,lol,lol1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(weight[i]>weight[j])
				{
					temp=weight[i];
					weight[i]=weight[j];
					weight[j]=temp;
					lol=pos[i];
					pos[i]=pos[j];
					pos[j]=lol;
					lol1=jump[i];
					jump[i]=jump[j];
					jump[j]=lol1;
				}
			}
		}
		for(int i=0;i<n-1;i++)
		{
			if(pos[i]>pos[i+1])
			{
				 while(pos[i]>=pos[i+1])
                  {
           	         pos[i+1]=pos[i+1]+jump[i+1];
                      count++;
                   }
			}
          

		}
		System.out.println(count);

		

		


	}
}

//https://www.codechef.com/FEB21C/problems/FROGS
