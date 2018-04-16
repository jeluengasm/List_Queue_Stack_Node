import java.io.*;

public class Lista {

	Sequence head = null;
	
	public boolean vacia()
	{
		return head == null ? true : false;
	}


	public void imprimirLista() 
	{
		BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(System.out));
		Sequence temp = head;
		
		try 
		{
			while(temp != null)
			{
				bw.write(temp.toString());
				temp = temp.next;
			}
			bw.flush();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

	public void insertarInicio(Sequence newSequence)
	{
		newSequence.next = head;
		head = newSequence;
	}
	
	public void insertarFinal(Sequence newSequence)
	{
		if(vacia())
			head = newSequence;
		else
		{
			Sequence temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = newSequence;
		}
	}
	
	public void eliminarInicio() 
	{
		Sequence temp = head; // se ncesesita para eliminar de memoria
		head = head.next;
		temp = null;
		//System.gc();//garbageCollector
	}
	
	public void eliminarFinal() 
	{
		Sequence t = head;
		while(t.next.next != null)
			t = t.next;
		t.next=null;	
	}
	
	public void eliminarN(int n) 
	{
		Sequence temp = head;
		
		for(int i=0; i<n-1; i++)
			temp = temp.next;
		temp.next = temp.next.next;		
	}
	
	public void insertarN (Sequence newSequence, int n)
	{
		Sequence temp = head;
		
		for(int i=0; i<n-1; i++)
			temp = temp.next;
		
		newSequence.next = temp.next;
		temp.next = newSequence;		
	}
	
	
	public static void main(String[] args) 
	{

	}

}
