package assignment04;
import java.util.*;

public class CircuitTester{
  public static void main(String[] args){

    ResonantCircuit circuit1 = new ResonantCircuit(1, 2, 3);
    System.out.println("Testing Resonant Circuit");
    System.out.println("Expected frequency: 1");
    System.out.println("Expected bandwidth: 2");
    System.out.println("Expected gain: 3");
    circuit1.display();
    System.out.println("-----------------------------------");

    ParallelResonantCircuit circuit2 = new ParallelResonantCircuit(4, 4, 4);
    System.out.println("Testing Series Circuit");
    System.out.println("Expected frequency: .25");
    System.out.println("Expected bandwidth: .0625");
    System.out.println("Expected gain: 4");
    System.out.println("Expected resistance: 4");
    System.out.println("Expected capacitance: 4");
    System.out.println("Expected inductance: 4");
    circuit2.display();
    System.out.println("-----------------------------------");

    SeriesResonantCircuit circuit3 = new SeriesResonantCircuit(5, 5, 5);
    System.out.println("Expected frequency: .2");
    System.out.println("Expected bandwidth: 1");
    System.out.println("Expected gain: .2");
    System.out.println("Expected resistance: 5");
    System.out.println("Expected capacitance: 5");
    System.out.println("Expected inductance: 5");
    circuit3.display();
  }
}
