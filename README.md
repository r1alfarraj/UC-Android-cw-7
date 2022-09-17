<div dir="rtl">
<p dir="rtl"><b><h2>
التمرين الاول💪 : </p></b></h2>


<p dir="rtl">
راح نربط تطبيقنا مع الFirebase </p>


<p dir="rtl"><b>
استخدم مشروعك السابق وعدل عليه</p></b>

١- ننشئ مشروع في firebase 

٢- نروح عند الRealTime DB  و ننشئ وحده و تكون read and write 

٣- ندخل بالاكاونت داخل Android studio 

٤- tools> firebase

٥- Connect to real time>> chose project

٦- نكتب الكود وداخله لينك الداتا بيس


٧- ننزل google.json وندخل applicatioID  و نضيف الملف وبس!

##

<b>تعريف الfirebase</b> 


FirebaseDatabase database = FirebaseDatabase.getInstance("URL");

DatabaseReference dbRef = database.getReference();


<p dir="rtl"><b><h2>
التمرين الثاني💪 : </p></b></h2>


ضيف الصور داخل Storage واستخدم الروابط في realtime database


<p dir="rtl"><b><h2>
التمرين الثالث💪 : </p></b></h2>


استخدم مكتبة Picasso لتحميل الصور من الرابط إلى الImageView

إضافة المكتبة في ملف المشروع  build.gradle
implementation 'com.squareup.picasso:picasso:2.5.2'

إضافة سطر في AndroidManifest.xml
<uses-permission android:name="android.permission.INTERNET"/> 

Picasso.with(this).load(URL).into(ImageView);


<p dir="rtl">
بالتوفيق مبرمجيننا 💚</p>
