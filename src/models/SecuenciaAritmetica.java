package models;

public class SecuenciaAritmetica {
    private short[] data;
    private short count = 0;
    public void initData(short size){
        data = new short[size];
    }
    public void setData(short[] array){
        for(short i=0;i<array.length;i++)
            data[i] = array[i];
    }

    public short getCount() {
        return count;
    }
    public boolean isSecuenciaAritmetica(short a, short b, short c){
        boolean flag = false;
        if (a<b && b<c)
            if (c-b == b-a)
                flag = true;

        return flag;
    }
    public void run (){
        for (short z=0;z< data.length-2;z++)
            for (short y=(short)(z+1);y< data.length-1;y++)
                for (short x=(short)(y+1);x< data.length;x++)
                    if (isSecuenciaAritmetica(data[z],data[y],data[x])) {
                        count++;
                        System.out.println("["+data[z]+","+data[y]+","+data[x]+"]");
                    }
    }
}
