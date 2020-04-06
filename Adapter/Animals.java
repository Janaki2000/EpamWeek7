package structural.adapter_pattern;


interface Bird 
{ 
 public void fly(); 
 public void Chirp(); 
} 

class Sparrow implements Bird 
{ 
 public void fly() 
 { 
     System.out.println("Flying"); 
 } 
 public void Chirp() 
 { 
     System.out.println("Chirp Chirp"); 
 } 
} 

interface ToyDuck 
{ 
 public void squeak(); 
} 

class PlasticToyDuck implements ToyDuck 
{ 
 public void squeak() 
 { 
     System.out.println("Squeak"); 
 } 
} 

class BirdAdapter implements ToyDuck 
{ 
 Bird bird; 
 public BirdAdapter(Bird bird) 
 { 
     // we need reference to the object we 
     // are adapting 
     this.bird = bird; 
 } 

 public void squeak() 
 { 
     bird.Chirp(); 
 } 
}

public class Animals {

	public static void main(String args[]) 
    { 
        Sparrow sparrow = new Sparrow(); 
        ToyDuck toyDuck = new PlasticToyDuck(); 
  
        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Sparrow..."); 
        sparrow.fly(); 
        sparrow.Chirp(); 
  
        System.out.println("ToyDuck..."); 
        toyDuck.squeak(); 
  
        System.out.println("BirdAdapter..."); 
        birdAdapter.squeak(); 
    } 
}