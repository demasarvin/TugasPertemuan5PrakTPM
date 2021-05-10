package com.example.tugaspertemuan5;

import java.util.ArrayList;
import java.util.List;

public class PemainData {
    public static List<PemainModel> fill_with_data(){
        List<PemainModel> data = new ArrayList<>();
        data.add(new PemainModel("Ibrahimović","Penyerang", "Zlatan Ibrahimović (lahir di Malmö, Skåne län, Swedia, 3 Oktober 1981; umur 39 tahun) adalah seorang pemain sepak bola asal Swedia yang bermain sebagai penyerang untuk AC Milan. Ibrahimović mengawali karier sepak dengan klub kota kelahirannya Malmö FF pada akhir 1990-an.",R.drawable.zlatan));
        data.add(new PemainModel("Donnarumma","Kiper", "Gianluigi Donnarumma (lahir di Castellammare di Stabia, 25 Februari 1999 (umur 22) merupakan seorang pemain sepak bola profesional dari Italia. Saat ini dia bermain untuk tim Serie A Italia, Milan dan juga timnas Italia.",R.drawable.donnarumma));
        data.add(new PemainModel("Çalhanoğlu","Gelandang", "Hakan Çalhanoğlu adalah pemain sepak bola Turki yang bermain sebagai gelandang serang untuk A.C. Milan dan tim nasional Turki.",R.drawable.hakan));
        data.add(new PemainModel("Tomori","Bek", "Oluwafikayomi Oluwadamilola Fikayo Tomori adalah pemain profesional yang bermain sebagai bek di klub Liga Inggris Chelsea F.C dan dipinjamkan ke AC Milan. Tomori pernah mewakili Kanada dan Inggris ditingkat junior.",R.drawable.tomori));
        data.add(new PemainModel("Rebić","Penyerang", "Ante Rebić adalah seorang pemain sepak bola berkewarganegaraan Kroasia yang bermain untuk klub Milan sebagai pemain pinjaman dari Eintracht Frankfurt biasa bermain pada posisi penyerang.",R.drawable.rebic));
        data.add(new PemainModel("Bennacer","Gelandang", "Ismaël Bennacer adalah seorang pemain sepak bola berkewarganegaraan Aljazair yang bermain untuk klub Milan pada posisi gelandang. Ismaël sebelumnya bermain untuk Arles sejak tahun 2015, sebelum kemudian pindah ke Arsenal pada tahun 2015.",R.drawable.bennacer));
        data.add(new PemainModel("Theo","Bek", "Theo Bernard François Hernández, yang dikenal hanya sebagai Theo, adalah pemain sepak bola profesional Prancis yang bermain untuk klub Italia, AC Milan sebagai bek kiri. Ia sebelumnya pernah bernain untuk Atlético Madrid, Deportivo Alavés, dan Real Madrid.",R.drawable.theo));
        data.add(new PemainModel("Kjaer","Bek", "Simon Kjær adalah pemain sepak bola Denmark. Ia berposisi sebagai bek tengah dan saat ini tengah membela klub Milan.",R.drawable.kjaer));
        data.add(new PemainModel("Kessié","Gelandang", "Franck Yannick Kessié adalah seorang pemain sepak bola Pantai Gading yang berposisi sebagai gelandang untuk tim Serie A Milan.",R.drawable.kessie));
        data.add(new PemainModel("Saelemaekers","Gelandang", "Alexis Jesse Saelemaekers adalah seorang pemain sepak bola profesional asal Belgia yang bermain untuk tim Serie A Milan. Dia dapat bermain di posisi gelandang dan bek.",R.drawable.sael));
        data.add(new PemainModel("Calabria","Bek", "Davide Calabria adalah seorang pemain sepak bola asal Italia yang bermain untuk tim A.C. Milan sebagai bek sayap.",R.drawable.calabria));

        return data;
    }
}
