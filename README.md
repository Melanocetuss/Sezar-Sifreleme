# 🔐 Sezar Şifreleme

**Sezar Şifreleme**, Java programlama dili kullanılarak geliştirilen bir metin şifreleme ve şifre çözme uygulamasıdır. Uygulama, **Sezar Şifreleme (Caesar Cipher)** algoritmasını kullanarak belirli bir kaydırma değeri ile metni şifreler veya şifrelenmiş metni çözer.

## 📌 Özellikler

- **Metin Şifreleme**:  
  Kullanıcıdan alınan metni belirlenen kaydırma değeri ile şifreler.  
- **Şifre Çözme**:  
  Şifrelenmiş metni orijinal haline döndürür.  
- **Kullanıcı Tanımlı Kaydırma Değeri**:  
  Kullanıcı, şifreleme sırasında istediği kaydırma değerini belirleyebilir.  

## 🔍 Sezar Şifreleme Algoritması

Sezar şifreleme, her harfi belirli bir kaydırma değeri kadar alfabede öteleme mantığına dayanır. Örneğin:  
- **Kaydırma = 3**  
  - `A → D`
  - `B → E`
  - `C → F`
  - `X → A`
  - `Y → B`
  - `Z → C`

Eğer kaydırma değeri negatif verilirse, ters yönde kaydırma işlemi yapılır.
