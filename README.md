# lifecycle
测试android:windowIsTranslucent对生命周期的影响

 - 第一次进入MainActivity
   - 透明窗口：   MainActivity#onCreate()->MainActivity#onStart()->MainActivity#onResume()
   - 不透明窗口： MainActivity#onCreate()->MainActivity#onStart()->MainActivity#onResume()
 - 第一次进入SecondActivity
   - 透明窗口：   MainActivity#onPause()->SecondActivity#onCreate()->SecondActivity#onStart()->SecondActivity#onResume()
   - 不透明窗口： MainActivity#onPause()->SecondActivity#onCreate()->SecondActivity#onStart()->SecondActivity#onResume()->MainActivity#onStop()->MainActivity#onSaveInstanceState()->MainActivity#onDestroy()
 - 点击home进入后台
   - 透明窗口：   SecondActivity#onPause()->MainActivity#onStop()->MainActivity#onSaveInstanceState()->SecondActivity#onStop()->SecondActivity#onSaveInstanceState()->MainActivity#onDestroy()
   - 不透明窗口： SecondActivity#onPause()->SecondActivity#onStop()->SecondActivity#onSaveInstanceState()->SecondActivity#onDestroy()
 - 点击桌面icon进入前台
   - 透明窗口：   MainActivity#onStart()->MainActivity#onRestoreInstanceState()->MainActivity#onResume()->SecondActivity#onRestart()->SecondActivity#onStart()->SecondActivity#onResume()
   - 不透明窗口： SecondActivity#onCreate()->SecondActivity#onStart()->SecondActivity#onRestoreInstanceState()->SecondActivity#onResume()
 - 点击返回键
   - 透明窗口：   MainActivity#onPause()-> MainActivity#onStop()->MainActivity#onDestroy()
   - 不透明窗口： SecondActivity#onPause()->MainActivity#onCreate()->MainActivity#onStart()->MainActivity#onRestoreInstanceState()->MainActivity#onResume()->SecondActivity#onStop()->SecondActivity#onDestroy()
