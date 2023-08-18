# Lab5

##  داک پروژه پروفایلینگ 

### قسمت اول 
در این قسمت ما به بررسی JavaCup می‌پردازیم. پس از اینکه profiling را روی main این کلاس اجرا کردیم، مشاهده می‌کنیم که cpu در یک قسمت به قله رسیده است. با مشاهده دقیق تر و کلیک کردن روی قسمت پیک نمودار، در پایین صفحه نام تابعی که در حال اجرا بوده است و موجب این مصرف cpu شده است را در می‌یابیم که نامش **temp** است.

در تصویر زیر منابع مصرفی مربوط به cpu است که با کلیک بر قله این نمودار، در پایین صفحه stack این لحظه از اجرا را می‌توانید مشاهده کنید که نام temp در صدر آن موجود است.

![image](pictures/javacup-cpu.png)

تصویر زیر نیز مربوط به مصرف مموری می‌باشد که اگر روی نمودار که روی پیک است، کلیک کنیم، استک برنامه در پایین صفحه نمایش داده می‌شود، که باز هم تابع temp در صدر آن قرار دارد که مشخص می‌کند این مصرف مربوط به این تابع می‌باشد. 
![image](pictures/javacup-memory.png)

حال با ریفکتور کردن کد و تغییر استفاده از 
آرایه ساده به جای ArrayList توانستیم سرعت اجرا را بسیار زیاد کنیم و در نتیجه آن مصرف منابع به شدت کاهش پیدا کرد.

کد بعد از ریفکتور:
![image](pictures/temp-func.png)


در تصویر زیر مصرف cpu را مشاهده می‌کنیم که پیک در تابع main است و حتی دیگر temp روی پیک نیست و مصرف کل اجرا نیز بسیار کم شده است.
![image](pictures/javacup-2-cpu.png)

.در تصویر زیر نیز مصرف مموری را مشاهده می‌کنیم که از گیگابایت در حالت قبل به مگابایت رسیده است که نشان دهنده کاهش مصرف مقدار زیادی از مموری است
به طوری که پیک دیگر در تابع temp نیست و روی main می‌باشد.
![image](pictures/javacup-2-memory.png)

