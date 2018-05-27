package client;

import org.apache.ws.axis2.MySQLServiceEquipmentStub;

import java.rmi.RemoteException;
import java.util.List;
import java.util.ArrayList;

public class Client {

    private final static String END_POINT = "http://localhost:1997/axis2/services/MySQLServiceEquipment?wsdl";

    public static void main(String[] args) throws RemoteException {
//get my spechial code is working
/*        MySQLServiceEquipmentStub stub = new MySQLServiceEquipmentStub(END_POINT);
        MySQLServiceEquipmentStub.GetMySpechialCode codeOperation = new MySQLServiceEquipmentStub.GetMySpechialCode();

        MySQLServiceEquipmentStub.GetMySpechialCodeResponse response = stub.getMySpechialCode(codeOperation);

        int returnedCode = response.get_return();
        System.out.println("Code: " + returnedCode);
*/

        MySQLServiceEquipmentStub stub = new MySQLServiceEquipmentStub(END_POINT);
        MySQLServiceEquipmentStub.GetEquipment equipmentOperation = new MySQLServiceEquipmentStub.GetEquipment();
        MySQLServiceEquipmentStub.GetEquipmentResponse response = stub.getEquipment(equipmentOperation);
        MySQLServiceEquipmentStub.Equipment[] returnedEquipment = response.get_return();
        System.out.println("Category: " + returnedEquipment[1].getCategory());

        MySQLServiceEquipmentStub.GetCabinet cabinetOperation = new MySQLServiceEquipmentStub.GetCabinet();
        MySQLServiceEquipmentStub.GetCabinetResponse response1 = stub.getCabinet(cabinetOperation);
        MySQLServiceEquipmentStub.Cabinet[] returnedCabinet = response1.get_return();
        System.out.println("CodeResponsible: " + returnedCabinet[1].getCodeResponsible());

        MySQLServiceEquipmentStub.GetResponsible responsibleOperation = new MySQLServiceEquipmentStub.GetResponsible();
        MySQLServiceEquipmentStub.GetResponsibleResponse response2 = stub.getResponsible(responsibleOperation);
        MySQLServiceEquipmentStub.Responsible[] returnedResponsible = response2.get_return();
        System.out.println("Code: " + returnedResponsible[1].getCode());

        MySQLServiceEquipmentStub.GetDistribution distributionOperation = new MySQLServiceEquipmentStub.GetDistribution();
        MySQLServiceEquipmentStub.GetDistributionResponse response3 = stub.getDistribution(distributionOperation);
        MySQLServiceEquipmentStub.Distribution[] returnedDistribution = response3.get_return();
        System.out.println("Code: " + returnedDistribution[1].getCode());

        MySQLServiceEquipmentStub.GetWriteoff writeoffOperation = new MySQLServiceEquipmentStub.GetWriteoff();
        MySQLServiceEquipmentStub.GetWriteoffResponse response4 = stub.getWriteoff(writeoffOperation);
        MySQLServiceEquipmentStub.Writeoff[] returnedWriteoff = response4.get_return();
        System.out.println("Code: " + returnedWriteoff[1].getCode());


    }

   /*private MySQLServiceEquipment client;

    public void connect(){
        client = new MySQLServiceEquipment();
        System.out.println("Connection open");
    }

    public List<Equipment> getEquipment()
    {
        List<Equipment> list = new ArrayList<Equipment>();
        try{
            list = client.getEquipment();
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Cabinet> getCabinet()
    {
        List<Cabinet> list = new ArrayList<Cabinet>();
        try{
            list = client.getCabinet();
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Responsible> getResponsible()
    {
        List<Responsible> list = new ArrayList<Responsible>();
        try{
            list = client.getResponsible();
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Distribution> getDistribution()
    {
        List<Distribution> list = new ArrayList<Distribution>();
        try{
            list = client.getDistribution();
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Writeoff> getWriteoff()
    {
        List<Writeoff> list = new ArrayList<Writeoff>();
        try{
            list = client.getWriteoff();
        } catch (Exception x) {
            x.printStackTrace();
        }
        return list;
    }

    public void addEquipment(Equipment eq)
    {
        try{
            client.addEquipment(eq);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addCabinet(Cabinet cab)
    {
        try{
            client.addCabinet(cab);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addResponsible(Responsible resp)
    {
        try{
            client.addResponsible(resp);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addDistribution(Distribution dist)
    {
        try{
            client.addDistribution(dist);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void addWriteoff(Writeoff wr)
    {
        try{
            client.addWriteoff(wr);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delEquipment(int code)
    {
        try{
            client.delEquipment(code);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delCabinet(int code)
    {
        try{
            client.delCabinet(code);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delResponsible(int code)
    {
        try{
            client.delResponsible(code);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delDistribution(int code)
    {
        try{
            client.delDistribution(code);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void delWriteoff(int code)
    {
        try{
            client.delWriteoff(code);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editEquipment(Equipment eq)
    {
        try{
            client.editEquipment(eq);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editCabinet(Cabinet cab)
    {
        try{
            client.editCabinet(cab);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editResponsible(Responsible resp)
    {
        try{
            client.editResponsible(resp);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editDistribution(Distribution dist)
    {
        try{
            client.editDistribution(dist);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void editWriteoff(Writeoff wr)
    {
        try{
            client.editWriteoff(wr);
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void close(){
        System.out.println("Connection closed");
    }*/
}


