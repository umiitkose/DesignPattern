package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 15:21      ║
╚════════════════════════════╝

*/

class Kullanici : IAbone {
    override fun mesajAl(message: String) {

        println(message)
    }

}