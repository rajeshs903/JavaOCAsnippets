package com.interfaceTest;

public class InterfaceTesting2 implements Walk, Run { // DOES NOT COMPILE
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
		}

@Override
public int getSpeed() {
	// TODO Auto-generated method stub
	return 3450;
}
		}

 interface Walk {
public default int getSpeed() {
return 5;
}
}
 interface Run {
public default int getSpeed() {
return 10;
}
}
 