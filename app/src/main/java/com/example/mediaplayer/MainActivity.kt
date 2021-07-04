package com.example.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.song_ticket.view.*

class MainActivity : AppCompatActivity() {

    var listSongs=ArrayList<SongInfo>()
    var adapter:MySongAdapter?=null
    var mp:MediaPlayer?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadURLOnline()
        adapter=MySongAdapter(listSongs)
        lsListSongs.adapter=adapter

        var mytracking=mySongTrack()
        mytracking.start()

    }

    fun loadURLOnline(){
        listSongs.add(SongInfo("001","Al-Fatihah","https://server6.mp3quran.net/thubti/001.mp3"))
        listSongs.add(SongInfo("002","Al-Baqarah","https://server6.mp3quran.net/thubti/002.mp3"))
        listSongs.add(SongInfo("003","Al-Imran","https://server6.mp3quran.net/thubti/003.mp3"))
        listSongs.add(SongInfo("004","An-Nisa'","https://server6.mp3quran.net/thubti/004.mp3"))
        listSongs.add(SongInfo("005","Al-Ma'idah","https://server6.mp3quran.net/thubti/005.mp3"))
        listSongs.add(SongInfo("006","Al-An'am","https://server6.mp3quran.net/thubti/006.mp3"))
        listSongs.add(SongInfo("007","Al-A'raf","https://server6.mp3quran.net/thubti/007.mp3"))
        listSongs.add(SongInfo("008","Al-Anfal","https://server6.mp3quran.net/thubti/008.mp3"))
        listSongs.add(SongInfo("009","At-Taubah","https://server6.mp3quran.net/thubti/009.mp3"))
        listSongs.add(SongInfo("010","Yunus","https://server6.mp3quran.net/thubti/010.mp3"))
        listSongs.add(SongInfo("011","Hood","https://server6.mp3quran.net/thubti/011.mp3"))
        listSongs.add(SongInfo("012","Yusuf","https://server6.mp3quran.net/thubti/012.mp3"))
        listSongs.add(SongInfo("013","Ar-Ra'd","https://server6.mp3quran.net/thubti/013.mp3"))
        listSongs.add(SongInfo("014","Ibrahim","https://server6.mp3quran.net/thubti/014.mp3"))
        listSongs.add(SongInfo("015","Al-Hijr","https://server6.mp3quran.net/thubti/015.mp3"))
        listSongs.add(SongInfo("016","An-Nahl","https://server6.mp3quran.net/thubti/016.mp3"))
        listSongs.add(SongInfo("017","Al-Isra","https://server6.mp3quran.net/thubti/017.mp3"))
        listSongs.add(SongInfo("018","Al-Kahf","https://server6.mp3quran.net/thubti/018.mp3"))
        listSongs.add(SongInfo("019","Maryam","https://server6.mp3quran.net/thubti/019.mp3"))
        listSongs.add(SongInfo("020","TaHa","https://server6.mp3quran.net/thubti/020.mp3"))
        listSongs.add(SongInfo("021","Al-Anbiya'","https://server6.mp3quran.net/thubti/021.mp3"))
        listSongs.add(SongInfo("022","Al-Hajj","https://server6.mp3quran.net/thubti/022.mp3"))
        listSongs.add(SongInfo("023","Al-Mu'minun","https://server6.mp3quran.net/thubti/023.mp3"))
        listSongs.add(SongInfo("024","An-Nur","https://server6.mp3quran.net/thubti/024.mp3"))
        listSongs.add(SongInfo("025","Al-Furqan","https://server6.mp3quran.net/thubti/025.mp3"))
        listSongs.add(SongInfo("026","Ash-Shu'ara'","https://server6.mp3quran.net/thubti/026.mp3"))
        listSongs.add(SongInfo("027","An-Naml","https://server6.mp3quran.net/thubti/027.mp3"))
        listSongs.add(SongInfo("028","Al-Qasas","https://server6.mp3quran.net/thubti/028.mp3"))
        listSongs.add(SongInfo("029","Al-'Ankabut","https://server6.mp3quran.net/thubti/029.mp3"))
        listSongs.add(SongInfo("030","ArRoom","https://server6.mp3quran.net/thubti/030.mp3"))
        listSongs.add(SongInfo("031","Luqman","https://server6.mp3quran.net/thubti/031.mp3"))
        listSongs.add(SongInfo("032","AsSajdah","https://server6.mp3quran.net/thubti/032.mp3"))
        listSongs.add(SongInfo("033","AlAhzab","https://server6.mp3quran.net/thubti/033.mp3"))
        listSongs.add(SongInfo("034","Saba'","https://server6.mp3quran.net/thubti/034.mp3"))
        listSongs.add(SongInfo("035","Fatir","https://server6.mp3quran.net/thubti/035.mp3"))
        listSongs.add(SongInfo("036","YaSin","https://server6.mp3quran.net/thubti/036.mp3"))
        listSongs.add(SongInfo("037","As-Saffat","https://server6.mp3quran.net/thubti/037.mp3"))
        listSongs.add(SongInfo("038","Sad","https://server6.mp3quran.net/thubti/038.mp3"))
        listSongs.add(SongInfo("039","Az-Zumar","https://server6.mp3quran.net/thubti/039.mp3"))
        listSongs.add(SongInfo("040","Ghafir","https://server6.mp3quran.net/thubti/040.mp3"))
        listSongs.add(SongInfo("041","Fussilat","https://server6.mp3quran.net/thubti/041.mp3"))
        listSongs.add(SongInfo("042","Ash-Shura","https://server6.mp3quran.net/thubti/042.mp3"))
        listSongs.add(SongInfo("043","Az-Zukhruf","https://server6.mp3quran.net/thubti/043.mp3"))
        listSongs.add(SongInfo("044","Ad-Dukhan","https://server6.mp3quran.net/thubti/044.mp3"))
        listSongs.add(SongInfo("045","Al-Jathiya","https://server6.mp3quran.net/thubti/045.mp3"))
        listSongs.add(SongInfo("046","Al-Ahqaf","https://server6.mp3quran.net/thubti/046.mp3"))
        listSongs.add(SongInfo("047","Muhammad","https://server6.mp3quran.net/thubti/047.mp3"))
        listSongs.add(SongInfo("048","Al-Fath","https://server6.mp3quran.net/thubti/048.mp3"))
        listSongs.add(SongInfo("049","Al-Hujurat","https://server6.mp3quran.net/thubti/049.mp3"))
        listSongs.add(SongInfo("050","Qaf","https://server6.mp3quran.net/thubti/050.mp3"))
        listSongs.add(SongInfo("051","Az-Zariyat","https://server6.mp3quran.net/thubti/051.mp3"))
        listSongs.add(SongInfo("052","At-Tur","https://server6.mp3quran.net/thubti/052.mp3"))
        listSongs.add(SongInfo("053","An-Najm","https://server6.mp3quran.net/thubti/053.mp3"))
        listSongs.add(SongInfo("054","Al-Qamar","https://server6.mp3quran.net/thubti/054.mp3"))
        listSongs.add(SongInfo("055","Ar-Rahman","https://server6.mp3quran.net/thubti/055.mp3"))
        listSongs.add(SongInfo("056","Al-Waqi'ah","https://server6.mp3quran.net/thubti/056.mp3"))
        listSongs.add(SongInfo("057","Al-Hadid","https://server6.mp3quran.net/thubti/057.mp3"))
        listSongs.add(SongInfo("058","Al-Mujadilah","https://server6.mp3quran.net/thubti/058.mp3"))
        listSongs.add(SongInfo("059","Al-Hashr","https://server6.mp3quran.net/thubti/059.mp3"))
        listSongs.add(SongInfo("060","Al-Al-Mumtahinah","https://server6.mp3quran.net/thubti/060.mp3"))
        listSongs.add(SongInfo("061","As-Saff","https://server6.mp3quran.net/thubti/061.mp3"))
        listSongs.add(SongInfo("062","Al-Jumu'ah","https://server6.mp3quran.net/thubti/062.mp3"))
        listSongs.add(SongInfo("063","Al-Munafiqun","https://server6.mp3quran.net/thubti/063.mp3"))
        listSongs.add(SongInfo("064","At-Taghabun","https://server6.mp3quran.net/thubti/064.mp3"))
        listSongs.add(SongInfo("065","At-Talaq","https://server6.mp3quran.net/thubti/065.mp3"))
        listSongs.add(SongInfo("066","At-Tahrim","https://server6.mp3quran.net/thubti/066.mp3"))
        listSongs.add(SongInfo("067","Al-Mulk","https://server6.mp3quran.net/thubti/067.mp3"))
        listSongs.add(SongInfo("068","Al-Qalam","https://server6.mp3quran.net/thubti/068.mp3"))
        listSongs.add(SongInfo("069","Al-Haqqah","https://server6.mp3quran.net/thubti/069.mp3"))
        listSongs.add(SongInfo("070","Al-Ma'arij","https://server6.mp3quran.net/thubti/070.mp3"))
        listSongs.add(SongInfo("071","Nooh","https://server6.mp3quran.net/thubti/071.mp3"))
        listSongs.add(SongInfo("072","Al-Jinn","https://server6.mp3quran.net/thubti/072.mp3"))
        listSongs.add(SongInfo("073","Al-Muzzammil","https://server6.mp3quran.net/thubti/073.mp3"))
        listSongs.add(SongInfo("074","Al-Muddaththir","https://server6.mp3quran.net/thubti/074.mp3"))
        listSongs.add(SongInfo("075","Al-Qiyamah","https://server6.mp3quran.net/thubti/075.mp3"))
        listSongs.add(SongInfo("076","Al-Insan","https://server6.mp3quran.net/thubti/076.mp3"))
        listSongs.add(SongInfo("077","Al-Mursalat","https://server6.mp3quran.net/thubti/077.mp3"))
        listSongs.add(SongInfo("078","An-Naba'","https://server6.mp3quran.net/thubti/078.mp3"))
        listSongs.add(SongInfo("079","An-Nazi'at","https://server6.mp3quran.net/thubti/079.mp3"))
        listSongs.add(SongInfo("080","Abas","https://server6.mp3quran.net/thubti/080.mp3"))
        listSongs.add(SongInfo("081","At-Takwir","https://server6.mp3quran.net/thubti/081.mp3"))
        listSongs.add(SongInfo("082","Al-Infitar","https://server6.mp3quran.net/thubti/082.mp3"))
        listSongs.add(SongInfo("083","Al-Mutaffifin","https://server6.mp3quran.net/thubti/083.mp3"))
        listSongs.add(SongInfo("084","Al-Inshiqaq","https://server6.mp3quran.net/thubti/084.mp3"))
        listSongs.add(SongInfo("085","Al-Buruj","https://server6.mp3quran.net/thubti/085.mp3"))
        listSongs.add(SongInfo("086","At-Tariq","https://server6.mp3quran.net/thubti/086.mp3"))
        listSongs.add(SongInfo("087","Al-A'la","https://server6.mp3quran.net/thubti/087.mp3"))
        listSongs.add(SongInfo("088","Al-Ghashiyah","https://server6.mp3quran.net/thubti/088.mp3"))
        listSongs.add(SongInfo("089", "Al-Fajr","https://server6.mp3quran.net/thubti/089.mp3"))
        listSongs.add(SongInfo("090","Al-Balad","https://server6.mp3quran.net/thubti/090.mp3"))
        listSongs.add(SongInfo("091","Ash-Shams","https://server6.mp3quran.net/thubti/091.mp3"))
        listSongs.add(SongInfo("092","Al-Lail","https://server6.mp3quran.net/thubti/092.mp3"))
        listSongs.add(SongInfo("093","Ad-Duha","https://server6.mp3quran.net/thubti/093.mp3"))
        listSongs.add(SongInfo("094","Ash-Sharh","https://server6.mp3quran.net/thubti/094.mp3"))
        listSongs.add(SongInfo("095","At-Tin","https://server6.mp3quran.net/thubti/095.mp3"))
        listSongs.add(SongInfo("096","Al-'Alaq","https://server6.mp3quran.net/thubti/096.mp3"))
        listSongs.add(SongInfo("097","Al-Qadr","https://server6.mp3quran.net/thubti/097.mp3"))
        listSongs.add(SongInfo("098","Al-Baiyinah","https://server6.mp3quran.net/thubti/098.mp3"))
        listSongs.add(SongInfo("099","Az-Zalzalah","https://server6.mp3quran.net/thubti/099.mp3"))
        listSongs.add(SongInfo("100","Al-'Adiyat","https://server6.mp3quran.net/thubti/0100.mp3"))
        listSongs.add(SongInfo("101","Al-Qari'ah","https://server6.mp3quran.net/thubti/101.mp3"))
        listSongs.add(SongInfo("102","At-Takathur","https://server6.mp3quran.net/thubti/102.mp3"))
        listSongs.add(SongInfo("103","Al-'Asr","https://server6.mp3quran.net/thubti/103.mp3"))
        listSongs.add(SongInfo("104", "Al-Humazah","https://server6.mp3quran.net/thubti/104.mp3"))
        listSongs.add(SongInfo("105","Al-Fil","https://server6.mp3quran.net/thubti/105.mp3"))
        listSongs.add(SongInfo("106","Quraish","https://server6.mp3quran.net/thubti/106.mp3"))
        listSongs.add(SongInfo("107","Al-Ma'un","https://server6.mp3quran.net/thubti/107.mp3"))
        listSongs.add(SongInfo("108", "Al-Kauthar","https://server6.mp3quran.net/thubti/108.mp3"))
        listSongs.add(SongInfo("109","Al-Kafirun","https://server6.mp3quran.net/thubti/109.mp3"))
        listSongs.add(SongInfo("110","An-Nasr","https://server6.mp3quran.net/thubti/110.mp3"))
        listSongs.add(SongInfo("111","Al-Masad","https://server6.mp3quran.net/thubti/111.mp3"))
        listSongs.add(SongInfo("112","Al-Ikhlas","https://server6.mp3quran.net/thubti/112.mp3"))
        listSongs.add(SongInfo("113","Al-Falaq","https://server6.mp3quran.net/thubti/113.mp3"))
        listSongs.add(SongInfo("114","An-Nas","https://server6.mp3quran.net/thubti/114.mp3"))

    }

    inner  class MySongAdapter:BaseAdapter{
        var  myListSong=ArrayList<SongInfo>()
        constructor(myListSong:ArrayList<SongInfo>):super(){
            this.myListSong=myListSong
        }
        override fun getCount(): Int {
            return this.myListSong.size
        }

        override fun getItem(position: Int): Any {
            return this.myListSong[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val myView= layoutInflater.inflate(R.layout.song_ticket,null)
            val Song= this.myListSong[position]
            myView.tvSongName.text = Song.Title
            myView.tvAuthor.text = Song.AuthorName

            myView.buPlay.setOnClickListener {
                //TODO: play song
                if(myView.buPlay.text == "Stop"){
                    mp!!.stop()
                    myView.buPlay.text = "Start"
                }else {
                    mp = MediaPlayer()
                    try {
                        mp!!.setDataSource(Song.SongURL)
                        mp!!.prepare()
                        mp!!.start()
                        myView.buPlay.text = "Stop"
                        sbProgress.max=mp!!.duration
                    } catch (ex: Exception) {
                    }
                }
            }
            return myView
        }
    }


    inner  class  mySongTrack :Thread(){
        override fun run() {
            while(true){
                try{
                    sleep(1000)
                }catch (ex:Exception){}
                runOnUiThread {
                    if (mp!=null){
                        sbProgress.progress = mp!!.currentPosition
                    }
                }
            }
        }
    }
}