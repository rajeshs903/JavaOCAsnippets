package com.interfaceTest;


public class InterfaceTesting1 
{
	public static void main(String[] args) {
Bear b =new Bear();
b.eatPlants();
b.eatPlants(39);
b.eatX();

	}

}

interface Omnivore {
	public void eatPlants();
	public void eatX();

}

interface Herbivore {
	public int eatPlants(int quantity);
	public int eatX();
}
/*interface MixVore extends Omnivore,Herbivore
{
public int eatX() method is error
	The return types are incompatible for the inherited methods Herbivore.eatX(), Omnivore.eatX()
	
}
*/
class Bear implements Herbivore, Omnivore {
	public int eatPlants(int quantity) {
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	public int eatX()	//The return type is incompatible with Omnivore.eatX() as they are same methods with diff return types
	{
		int eat=5;
		System.out.println("eating xxxxxxxxxxxxx... Herbivore "+eat);
		return eat;
	}
	
	public void eatPlants() {
		System.out.println("Eating plants");
	}
}