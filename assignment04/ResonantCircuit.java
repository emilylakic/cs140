package assignment04;
import java.util.*;

public class ResonantCircuit{
  private double frequency;
  private double bandwidth;
  private double gain;

  public ResonantCircuit(double f, double b, double k){
    frequency = f;
    bandwidth = b;
    gain = k;
  }

  public void display(){
    System.out.println("Resonant Circuit Characteristics:");
    System.out.println("\t" + "frequency: " + frequency);
    System.out.println("\t" + "bandwidth: " + bandwidth);
    System.out.println("\t" + "gain: " + gain);
  }


}
