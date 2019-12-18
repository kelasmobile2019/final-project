package com.study.vapinginfo

object VaporData {
    private val deviceName = arrayOf("Suorin Cartridge Air",
        "Kamry X6", "SMOANT S8", "Smart XEN", "Wismec Predator",
        "Vaporstorm Puma", "VGOD Pro Mech", "IQOS 2.4", "Eleaf iStick",
        "Tesla Terminator")

    private val deviceDetails = arrayOf("Kecil, sederhana, dan ringkas, itulah kesan pertama dari VAPE tipe cartridge keluaran dari Suorin ini. Hadir dengan kemasan yang modern, produk  ini juga dilengkapi dengan baterai berkapasitas 400 mAH dan volume cartridge sebanyak 2 ml. Kapasitas volume cartridge-nya membuat Anda tak perlu sering-sering isi ulang sehingga dapat menghemat jumlah cairan VAPE Anda.",
        "Produk keluaran Kamry ini cocok untuk pemula ataupun yang ingin mencoba alternatif lain. Keistimewaan produk ini adalah Anda dapat mengatur jumlah uapnya dengan hanya menekan tombol secara cepat. Besarannya sendiri terdiri dari 3,6 V untuk tingkat rendah, 3,8 V untuk tingkat menengah, dan tingkat tertinggi pada 4,2 V. Mudah, bukan? Cara mengisi cairannya pun mudah. Anda hanya tinggal membuka bagian atasnya dan isi ke dalam tangki pada bagian dalamnya.",
        "Produk terbaru keluaran SMOANT ini memberikan inovasi untuk VAPE. Dengan dilengkapi desain berbentuk pod, VAPE yang satu ini menawarkan banyak kelebihan. Di antaranya adalah desain yang kecil sehingga mudah dibawa kemana saja. Selain itu, VAPE tipe ini tidak memerlukan tombol untuk mengeluarkan uap, Anda hanya tinggal hisap saja sesuai dengan selera Anda. Sangat cocok untuk Anda yang tidak mau repot.",
        "Untuk produk yang satu ini, kelebihan yang ditonjolkan Smart Vape selaku produsen adalah kesederhanaan konsepnya. Seperti yang telah kami bahas di atas, produk tipe ini merupakan pengganti rokok yang sifatnya disposable atau sekali pakai buang layaknya rokok biasa. Untuk harganya sendiri bisa dibilang produk ini cukup terjangkau dan hemat biaya, terutama bagi Anda yang bukan perokok berat.",
        "Sesuai namanya, produk keluaran Wismec ini mampu mencapai tingkat output maksimum sebesar 228W/50A. Didukung dengan desain yang wah, produk ini terkesan kokoh dan tahan lama. Memang seperti itu faktanya, dengan didukung hingga 18.650 buah sel baterai menjadikan produk ini memiliki performa yang kuat.",
        "Vapor storm hadir dengan varian Puma 200W. Sesuai dengan namanya, produk ini mampu mengeluarkan daya hingga 200W. Produk ini dilengkapi dengan dual battery dan layar LED yang menampilkan keterangan pada VAPE Anda, seperti suhu, tegangan, dan kapasitasnya. VAPE ini dapat dinyalakan dengan menekan tombol sebanyak lima kali, dan dapat diatur kapasitas uapnya.",
        "Jika dilihat dari luar, desain produk keluaran VGOD ini terlihat sederhana. Namun sesungguhnya, produk ini memiliki bahan-bahan yang bisa dibilang terbaik dan kompleks. Secara keseluruhan, produk ini dibuat dari tembaga Billet dan per yang berlapis emas. Selain itu, logo VGOD yang melapisi bagian luarnya juga cukup mencolok. Produk ini terdiri dari baterai single dan memiliki 510 jaringan bersifat hybrid.",
        "IQOS 2.4 dilengkapi dengan lampu LED yang lebih terang dan sistem vibrasi yang menyala saat lowbatt, baterai yang lebih tahan lama, serta kemampuan pemanas yang lebih merata ketimbang seri sebelumnya. Bagi Anda yang ingin merasakan sensasi nikmat dari panas alami tembakau, Anda bisa memilih produk ini. Cara menggunakannya masih sama, Anda hanya memasukkan rokok Anda ke dalam pemanas dan rasakan sensasinya!",
        "Eleaf iStick Pico adalah perangkat VAPE dengan desain yang minimalis dan mudah dibawa kemana saja. Produk ini mampu mengeluarkan daya sebesar 75W dan 5,5V. Kelebihan produk ini adalah posisi baterai yang diletakkan terpisah dari tank dan atomizer yang mencegah baterai panas karena berada di dekat tank.",
        "Teslacigs hadir dengan varian andalannya yaitu Terminator. Produk ini memiliki desain yang kurang lebih dekat di bayangan masyarakat, seolah menjadi bentuk standar VAPE pada umumnya. Untuk hasil yang maksimal, kami menyarankan Anda untuk menghisap dengan tipe RDA Antman 22. Tegangan output yang dihasilkan mampu mencapai 90W.")

    private val deviceImg = intArrayOf(R.drawable.suorin_cartridgeair,
        R.drawable.kamry_x6,R.drawable.smoant_s8, R.drawable.smart_xen,
        R.drawable.wismec_predator, R.drawable.puma, R.drawable.vgod,
        R.drawable.iqos_2, R.drawable.eleaf_istick, R.drawable.tesla_terminator)

    val listData: ArrayList<Vapor>
        get() {
            val list = arrayListOf<Vapor>()
                for (counting in deviceName.indices){
                    val vapor = Vapor()
                    vapor.name = deviceName[counting]
                    vapor.details = deviceDetails[counting]
                    vapor.photo = deviceImg[counting]
                    list.add(vapor)
                }
            return list
        }
}