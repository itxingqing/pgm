/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1_factors;

/**
 *
 * @author Arturo.Alatriste
 */

//public class OdometerStatus {}

public enum OdometerStatus {
Reset,

/* The odometer is reset, 
the status is set to Started, 
the values are set to ceros, the sum is cero, 
and the numOfAdditions is set to cero */
StartedInCeros,

//Stopped,
RunningNotInCeros,
PassedMaximum

};