/*import java.math.BigInteger;

public class ComplexCalculation {
    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
        BigInteger overallresult;
        
            Calculate result = ( base1 ^ power1 ) + (base2 ^ power2).
            Where each calculation in (..) is calculated on a different thread
        
        Thread thread1 = new PowerCalculatingThread(BigInteger.valueOf(10L),BigInteger.valueOf(2L));
        Thread thread2 = new PowerCalculatingThread(BigInteger.valueOf(10L),BigInteger.valueOf(2L));
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        overallresult = getResult().add(getResult());
        return overallresult;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;
    
        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }
    
        @Override
        public void run() {
           
           Implement the calculation of result = base ^ power
           
           result = base.pow(power.intValue());
        }
    
        public BigInteger getResult() { return result; }
    }
}*/