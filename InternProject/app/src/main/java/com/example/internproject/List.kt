package com.example.internproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val x = ArrayList<Mylist>()

        x.add(Mylist(R.drawable.batterybig, "UGX 15000", "itel BL-25BI"))
        x.add(Mylist(R.drawable.batterysmal, "UGX 6500", "itel BL-5C"))
        x.add(Mylist(R.drawable.belief, "UGX 5500", "Belief Battery BP-4L"))
        x.add(Mylist(R.drawable.beliefbatteryfivec, "UGX 6000", "Belief Battery BP-5c"))
        x.add(Mylist(R.drawable.belief_usb, "UGX 4000", "USB Cable"))
        x.add(Mylist(R.drawable.beliefeightgb, "UGX 20000", "Belief Memory Card 8GB"))
        x.add(Mylist(R.drawable.beliefflash, "UGX 20000", "Belief Flash Disk 4GB"))
        x.add(Mylist(R.drawable.belieffourgb, "UGX 15000", "Belief Memory Card 4GB"))
        x.add(Mylist(R.drawable.belieftwogb, "UGX 10000", "Belief Memory Card 2GB"))
        x.add(Mylist(R.drawable.beliefonegb, "UGX 8000", "Belief Memory Card 1GB"))
        x.add(Mylist(R.drawable.flash_belief16gb, "UGX 30000", "Belief Memory Card 16GB"))
        x.add(Mylist(R.drawable.charger_golf, "UGX 7000", "Golf Charger"))
        x.add(Mylist(R.drawable.chargerheadgolf, "UGX 9000", "Golf Charger Head"))
        x.add(Mylist(R.drawable.golf_usb_v8, "UGX 3500", "Golf USB Cable V8"))
        x.add(Mylist(R.drawable.golfbattery, "UGX 12000", "Golf Battery BL-5C"))
        x.add(Mylist(R.drawable.golfusb, "UGX 15000", "Golf USB Type-C"))
        x.add(Mylist(R.drawable.itel_usb_v8, "UGX 10000", "itel USB V8"))
        x.add(Mylist(R.drawable.muju_usb_twom, "UGX 13000", "Muju USB V8 2M"))






        val m = Listadapter(this, x)
        val l = findViewById<ListView>(R.id.listview)
        l.adapter = m


    }

    class Listadapter : BaseAdapter {
        var img: Context? = null

        var nam: ArrayList<Mylist>? = null

        constructor(a: Context?, b: ArrayList<Mylist>) : super() {
            this.img = a
            this.nam = b
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val pan = img!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val p = pan.inflate(R.layout.list_view,null)//helps to access the element from the list group to th list view


            val tex = p.findViewById<TextView>(R.id.textView8)
            val tex2 = p.findViewById<TextView>(R.id.textView9)
            val ima = p.findViewById<ImageView>(R.id.imageView4)
            tex.text = nam!![position].name
            tex2.text = nam!![position].Details
            ima.setImageResource(nam!![position].image!!)
            return p
        }

        override fun getItem(position: Int): Any {
            return nam!![position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return nam!!.size
        }
    }
}
