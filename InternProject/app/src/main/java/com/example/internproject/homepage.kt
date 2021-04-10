package com.example.internproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import kotlin.coroutines.coroutineContext

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)




        val x = ArrayList<Mygrid>()

        x.add(Mygrid(R.drawable.phones, "", "Mobiles"))
        x.add(Mygrid(R.drawable.bulbs, "", "lighting"))
        x.add(Mygrid(R.drawable.images, "Radios", "and Robots"))


        x.add(Mygrid(R.drawable.solar, "Products", "Solar"))
        x.add(Mygrid(R.drawable.extensioncable, "", "Electricals"))
        x.add(Mygrid(R.drawable.television, "Appliances ", "Major"))
        x.add(Mygrid(R.drawable.woofers, "", "Audio"))
        x.add(Mygrid(R.drawable.pacolator, "Appliances", "Small"))
        x.add(Mygrid(R.drawable.accessories, "", "Accessories"))



        val m = GridAdpter(this,x)
        val l = findViewById<GridView>(R.id.grid_view)
        l.adapter = m



    }
 class GridAdpter : BaseAdapter{
     var img: Context? = null

     var nam:ArrayList<Mygrid>? = null
     constructor(a: Context?, b:ArrayList<Mygrid>):super() {
         this.img = a
         this.nam = b
     }


     override fun getView(index: Int, convertView: View?, parent: ViewGroup?): View {
         val pan = img!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
         val p = pan.inflate(R.layout.grid,null)//helps to access the element from the list group to th list view


         val tex = p.findViewById<TextView>(R.id.textView3)
         val tex2 = p.findViewById<TextView>(R.id.textView4)
         val ima = p.findViewById<ImageView>(R.id.imageView2)
         tex.text = nam!![index].name
         tex2.text = nam!![index].Details
         ima.setImageResource(nam!![index].image!!)



ima.setOnClickListener{
    var intent = Intent(img,List::class.java)

    img!!.startActivity(intent)
   /* var intent1 = (ima.setImageResource(R.drawable.phones))
    ima.context.startActivity(Intent("mylist"))*/

}





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
