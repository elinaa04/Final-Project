import java.util.LinkedList;
import java.util.Queue;

public class antrian { 
    Queue<String> antrianPemeriksaan;
    int front;
    int rear;
    int maxQueue;

    public antrian(int maxQueue) {
        this.maxQueue = maxQueue;
        antrianPemeriksaan = new LinkedList<>();
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return (rear == maxQueue - 1);
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    //method menambahkan pasien ke dalam antrian
    public void tambahAntrian(String namaPasien) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan pasien.");
        } else {
            antrianPemeriksaan.offer(namaPasien);
            rear++;
            System.out.println("Pasien " + namaPasien + " telah ditambahkan ke dalam antrian.");
        }
    }

    //method memanggil antrian
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            String pasien = antrianPemeriksaan.poll();
            front++;
            System.out.println("Pasien " + pasien + " dipanggil untuk pemeriksaan.");
        }
    }

    //method menampilkan antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            int nomor = front + 1; 
            for (String pasien : antrianPemeriksaan) {
                System.out.println(pasien);
                nomor++;
            }
        }
    }
}

