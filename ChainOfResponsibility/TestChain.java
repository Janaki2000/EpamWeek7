package behavioral.chain_of_responsibility_pattern;

interface Chain 
{ 
	public abstract void setNext(Chain nextInChain); 
	public abstract void process(Number request); 
} 

class No
{ 
	private int number; 

	public Number(int number) 
	{ 
		this.number = number; 
	} 

	public int getNumber() 
	{ 
		return number; 
	} 

} 

class NegativeProcessor implements Chain 
{ 
	private Chain nextInChain; 

	public void setNext(Chain c) 
	{ 
		nextInChain = c; 
	} 

	public void process(No r) 
	{ 
		if (r.getNumber() < 0) 
		{ 
			System.out.println("It is found to be a negetive number : " + request.getNumber()); 
		} 
		else
		{ 
			nextInChain.process(r); 
		} 
	} 
} 

class ZeroProcessor implements Chain 
{ 
	
	private Chain nextInChain; 

	public void setNext(Chain c) 
	{ 
		nextInChain = c; 
	} 

	public void process(No r) 
	{ 
		if (request.getNumber() == 0) 
		{ 
			System.out.println("It is found to be Zero : " + request.getNumber()); 
		} 
		else
		{ 
			nextInChain.process(r); 
		} 
	} 
} 

class PositiveProcessor implements Chain 
{ 

	private Chain nextInChain; 

	public void setNext(Chain c) 
	{ 
		nextInChain = c; 
	} 

	public void process(No r) 
	{ 
		if (request.getNumber() > 0) 
		{ 
			System.out.println("It is found to be a positive number : " + request.getNumber()); 
		} 
		else
		{ 
			nextInChain.process(request); 
		} 
	} 
} 

public class TestChain 
{ 
	public static void main(String[] args) { 
		 
		Chain chain1 = new NegativeProcessor(); 
		Chain chain2 = new ZeroProcessor(); 
		Chain chain3 = new PositiveProcessor(); 
		chain1.setNext(c2); 
		chain2.setNext(c3); 

		chain1.process(new No(100)); 
		chain1.process(new No(-20)); 
		chain1.process(new No(0)); 
		chain1.process(new No(0)); 
	} 
} 