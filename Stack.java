

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Stack {

	Nodo head = null;
	
	public boolean vacia()
	{
		return head == null ? true : false;
	}


	public void printStack() 
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Nodo temp = head;		
		try 
		{
			bw.write("Stack\n");
			while(!vacia())			
				bw.write(pop());				
			
			bw.flush();//print
			
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	

	public void push(Nodo nuevoNodo)
	{
		nuevoNodo.next = head;
		head = nuevoNodo;
	}
	
	public String pop() //Similar to delete
	{
		Nodo temp = head; 
		head = head.next;
		String info = temp.toString();
		temp = null;
		System.gc();//garbageCollector
		return info;		
	}
	
	public String peek()//return item of the head
	{
		if(vacia())
			return "Stack Empty";
		else
		{
			Nodo temp = head;
			String info = temp.toString();
			return info;
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Stack pila = new Stack();		
		
		pila.push(new Nodo("Tarea 1", 2.5));		
		pila.push(new Nodo("Quiz 1", 1.5));		
		pila.push(new Nodo("Quiz 3", 1.5));
		pila.push(new Nodo("Eliminar", 1.5));
		pila.pop();
		pila.printStack();
	}

}
