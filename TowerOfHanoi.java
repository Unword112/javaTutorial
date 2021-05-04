// JAVA recursive function to
// solve tower of hanoi puzzle
import java.util.*;
import java.io.*;
import java.math.*;
class towerOfHanoi {
    static void towerHanoi(int n, char from_rod,char to_rod, char aux_rod){
	
    if (n == 1){
		System.out.println("Move disk 1 from rod "+ from_rod+" to rod "+to_rod);
		return;
	}
	towerHanoi(n - 1, from_rod, aux_rod, to_rod);
	System.out.println("Move disk "+ n + " from rod " +
					from_rod +" to rod " + to_rod );
    towerHanoi(n - 1, aux_rod, to_rod, from_rod);
}

// Driver code
public static void main(String args[]){
	towerOfHanoi t = new towerOfHanoi();
    t.towerHanoi(4, 'A', 'B', 'C');
    }
}

// This code is contributed by jyoti369
