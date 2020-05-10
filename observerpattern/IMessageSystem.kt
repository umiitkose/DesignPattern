package com.umiitkose.observerpattern

/* Code with ❤
╔════════════════════════════╗
║  Created by Ümit KÖSE      ║
╠════════════════════════════╣
║   umiitkose@gmail.com      ║
╠════════════════════════════╣
║     10.05.2020 - 15:14      ║
╚════════════════════════════╝

*/
// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar. Observable'a denk gelir
interface IMessageSystem {

   fun addUser(kullanici: Kullanici)
   fun removeUser(kullanici: Kullanici)
   fun sendMessage(message: String)

}