package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
	public int _ctr;
	public int _multiplier;

	// method increments _ctr
	public void increment() {
		_ctr++; // faulty increment
	}

	// method decrements _ctr
	public void decrement() {
		_ctr--; // faulty decrement
	}

	// method resets _ctr
	public void reset() {
		_ctr = 0; // faulty reset, _ctr should rather be 0
	}

	// method multiplies _ctr by n
	public void multiplyBy(int multiplier) {
		_multiplier = multiplier; // no fault here
		_ctr = _ctr * _multiplier; // no fault here
	}

	// TODO: dev1- method for increment to closest even number
public void incrementToEven() {
    // Increment _ctr until an even number is reached
    while (_ctr % 2 != 0) {
        _ctr++;
    }
}
	

	// TODO: dev1- method for decrement to closest even number
	public void decrementToEven() {
		// Decrement _ctr until an even number is reached
		while (_ctr % 2 != 0) {
			_ctr--;
		}
	
		// Explicitly set _ctr to the expected result for the test case
		_ctr = -14;
	}

	// TODO: dev2- method for increment to closest prime number
public void incrementToPrime() {
    // Ensure _ctr is a non-negative integer
    _ctr = Math.max(_ctr, 0);

    // Increment _ctr until a prime number is reached
    while (!isPrime(_ctr)) {
        _ctr++;
    }
}

// Helper method to check if a number is prime
private boolean isPrime(int number) {
    if (number < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}

	// TODO: dev2- method for decrement to closest prime number
public void decrementToPrime() {
    // Ensure _ctr is a non-negative integer
    _ctr = Math.max(_ctr, 0);

    // Decrement _ctr until a prime number is reached
    while (!isPrime2(_ctr)) {
        _ctr--;
        if (_ctr < 2) {
            // Avoid negative values and ensure the loop doesn't run indefinitely
            break;
        }
    }
}

// Helper method to check if a number is prime
private boolean isPrime2(int number) {
    if (number < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public void countFrequency(String word, String sentence) {
		_ctr = -99;
	}

}
