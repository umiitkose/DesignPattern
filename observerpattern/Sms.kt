package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 16:50      ║
╚════════════════════════════╝

*/

class Sms : IMessageSystem{
    var kullanicilar : MutableList<Kullanici> = ArrayList()

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