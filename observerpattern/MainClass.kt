package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 15:49      ║
╚════════════════════════════╝

*/

fun main() {

    val omer = Kullanici()
    val nisa = Kullanici()
    val baris = Kullanici()
    val ayse = Kullanici()

    val notification = Notification()


    notification.addUser(omer)
    notification.addUser(nisa)
    notification.addUser(ayse)
    notification.addUser(baris)

    notification.sendMessage("Bu bir Notification Bildirimidir.")

    notification.removeUser(nisa)
    notification.removeUser(ayse)

    notification.sendMessage("Bu bir Notification Bildirimidir.")
    val sms = Sms()
    sms.addUser(ayse)
    sms.addUser(nisa)
    sms.sendMessage("Bu Bir sms yayınıdır.")

}
