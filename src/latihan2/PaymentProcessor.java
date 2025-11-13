package latihan2;

// Implementasikan class PaymentProcessor
public class PaymentProcessor {
    // Method untuk memproses pembayaran apapun
    // Gunakan polymorphism!
    public void proses(Pembayaran payment, double jumlah) {
        payment.prosesPembayaran(jumlah);
    }
}
