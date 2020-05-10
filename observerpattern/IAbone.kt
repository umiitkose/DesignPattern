package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 15:20      ║
╚════════════════════════════╝

*/

// Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür. Observer !
 interface IAbone {
    fun mesajAl(message: String)
}