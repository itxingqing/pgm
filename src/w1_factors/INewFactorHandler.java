/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 **************************************************************************
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 * 
 * Interface   : INewFactorHandler
 * description : encapsulate the methods for all the frames that crate factors
 * Date        : 2014 - December - 6
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/



package w1_factors;

/**
 *
 * @author ojodecocodrilo
 */
public interface INewFactorHandler {
    public void addNewFactorListener( FactorEventListener listener );
    public void removeNewFactorListener( FactorEventListener listener );
    public void OnFactorCreated( FactorCreated evt );
}
