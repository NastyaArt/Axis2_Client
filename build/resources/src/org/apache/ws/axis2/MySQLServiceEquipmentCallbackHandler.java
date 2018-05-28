/**
 * MySQLServiceEquipmentCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package org.apache.ws.axis2;


/**
 *  MySQLServiceEquipmentCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class MySQLServiceEquipmentCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MySQLServiceEquipmentCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MySQLServiceEquipmentCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for addEquipment method
     * override this method for handling normal response from addEquipment operation
     */
    public void receiveResultaddEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.AddEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addEquipment operation
     */
    public void receiveErroraddEquipment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDistribution method
     * override this method for handling normal response from getDistribution operation
     */
    public void receiveResultgetDistribution(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetDistributionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDistribution operation
     */
    public void receiveErrorgetDistribution(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCabinet method
     * override this method for handling normal response from getCabinet operation
     */
    public void receiveResultgetCabinet(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetCabinetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCabinet operation
     */
    public void receiveErrorgetCabinet(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getResponsible method
     * override this method for handling normal response from getResponsible operation
     */
    public void receiveResultgetResponsible(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetResponsibleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getResponsible operation
     */
    public void receiveErrorgetResponsible(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMySpechialCode method
     * override this method for handling normal response from getMySpechialCode operation
     */
    public void receiveResultgetMySpechialCode(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetMySpechialCodeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMySpechialCode operation
     */
    public void receiveErrorgetMySpechialCode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWriteoff method
     * override this method for handling normal response from getWriteoff operation
     */
    public void receiveResultgetWriteoff(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetWriteoffResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWriteoff operation
     */
    public void receiveErrorgetWriteoff(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getEquipment method
     * override this method for handling normal response from getEquipment operation
     */
    public void receiveResultgetEquipment(
        org.apache.ws.axis2.MySQLServiceEquipmentStub.GetEquipmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getEquipment operation
     */
    public void receiveErrorgetEquipment(java.lang.Exception e) {
    }
}
