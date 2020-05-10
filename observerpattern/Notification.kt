package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 15:18      ║
╚════════════════════════════╝

*/
class Notification : IMessageSystem {

    private val kullanicilar : MutableList<IAbone>

    init {
        kullanicilar = ArrayList()
    }

    override fun addUser(kullanici: Kullanici) {

        kullanicilar.add(kullanici)
    }

    override fun removeUser(kullanici: Kullanici) {
        kullanicilar.remove(kullanici)
    }

    override fun sendMessage(message: String) {
        kullanicilar.indices.forEach {
            kullanicilar[it].mesajAl(message)
        }
    }


}