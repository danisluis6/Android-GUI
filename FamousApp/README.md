
# LOGIN
- Project: Login01

![alt tag](https://github.com/danisluis6/GUI/blob/master/Login01/1.png)

    - ImageView,TextView => width: wrap_content / height: auto => layout_gravity: center_horizontal
    - Edittext: width: match_parent / height: wrap_content => layout_gravity: center
    - Designed photoshop: using layout_marginBottom: xxx
    - compile 'com.android.support:design:23.0.1'

	<?xml version="1.0" encoding="utf-8"?>
	<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:tools="http://schemas.android.com/tools"
	    android:layout_width="fill_parent"
	    android:layout_height="fill_parent"
	    android:fitsSystemWindows="true">

	    <LinearLayout
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:orientation="vertical"
		android:paddingTop="56dp"
		android:paddingLeft="24dp"
		android:paddingRight="24dp">

		<!-- Image View -->
		<ImageView
		    android:layout_width="wrap_content"
		    android:layout_height="72dp"
		    android:layout_marginBottom="24dp"
		    android:layout_gravity="center_horizontal" />

		<!-- Email Label -->
		<android.support.design.widget.TextInputLayout
		    android:layout_width="match_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="8dp"
		    android:layout_marginBottom="8dp">
		    <EditText android:id="@+id/input_email"
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			android:inputType="textEmailAddress"
			android:hint="Email" />
		</android.support.design.widget.TextInputLayout>

		<!-- Password Label -->
		<android.support.design.widget.TextInputLayout
		    android:layout_width="match_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="8dp"
		    android:layout_marginBottom="8dp">
		    <EditText android:id="@+id/input_password"
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			android:inputType="textPassword"
			android:hint="Password"/>
		</android.support.design.widget.TextInputLayout>

		<android.support.v7.widget.AppCompatButton
		    android:id="@+id/btn_login"
		    android:layout_width="fill_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="24dp"
		    android:layout_marginBottom="24dp"
		    android:padding="12dp"
		    android:text="Login"/>

		<TextView android:id="@+id/link_signup"
		    android:layout_width="fill_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginBottom="24dp"
		    android:text="No account yet? Create one"
		    android:gravity="center"
		    android:textSize="16dip"/>

	    </LinearLayout>

	</ScrollView>


![alt tag](https://github.com/danisluis6/GUI/blob/master/Login01/2.png)

    - ImageView insert image from drawable. Example logo.png
    - compile 'com.jakewharton:butterknife:6.1.0'
    - Using attribute: @Bind

	<?xml version="1.0" encoding="utf-8"?>
	<ScrollView
	    xmlns:android="http://schemas.android.com/apk/res/android"
	    android:layout_width="fill_parent"
	    android:layout_height="fill_parent"
	    android:fitsSystemWindows="true">

	    <LinearLayout
		android:orientation="vertical"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:paddingTop="56dp"
		android:paddingLeft="24dp"
		android:paddingRight="24dp">

		<ImageView android:src="@drawable/logo"
		    android:layout_width="wrap_content"
		    android:layout_height="72dp"
		    android:layout_marginBottom="24dp"
		    android:layout_gravity="center_horizontal" />

		<!--  Name Label -->
		<android.support.design.widget.TextInputLayout
		    android:layout_width="match_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="8dp"
		    android:layout_marginBottom="8dp">
		    <EditText android:id="@+id/input_name"
		        android:layout_width="match_parent"
		        android:layout_height="wrap_content"
		        android:inputType="textCapWords"
		        android:hint="Name" />
		</android.support.design.widget.TextInputLayout>

		<!-- Email Label -->
		<android.support.design.widget.TextInputLayout
		    android:layout_width="match_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="8dp"
		    android:layout_marginBottom="8dp">
		    <EditText android:id="@+id/input_email"
		        android:layout_width="match_parent"
		        android:layout_height="wrap_content"
		        android:inputType="textEmailAddress"
		        android:hint="Email" />
		</android.support.design.widget.TextInputLayout>

		<!-- Password Label -->
		<android.support.design.widget.TextInputLayout
		    android:layout_width="match_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="8dp"
		    android:layout_marginBottom="8dp">
		    <EditText android:id="@+id/input_password"
		        android:layout_width="match_parent"
		        android:layout_height="wrap_content"
		        android:inputType="textPassword"
		        android:hint="Password"/>
		</android.support.design.widget.TextInputLayout>

		<!-- Signup Button -->
		<android.support.v7.widget.AppCompatButton
		    android:id="@+id/btn_signup"
		    android:layout_width="fill_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginTop="24dp"
		    android:layout_marginBottom="24dp"
		    android:padding="12dp"
		    android:text="Create Account"/>

		<TextView android:id="@+id/link_login"
		    android:layout_width="fill_parent"
		    android:layout_height="wrap_content"
		    android:layout_marginBottom="24dp"
		    android:text="Already a member? Login"
		    android:gravity="center"
		    android:textSize="16dip"/>

	    </LinearLayout>
	</ScrollView>


![alt tag](https://github.com/danisluis6/GUI/blob/master/Login01/3.png)
![alt tag](https://github.com/danisluis6/GUI/blob/master/Login01/4.png)

    - colors.xml
    - <?xml version="1.0" encoding="utf-8"?>
	<resources>
	    <color name="colorPrimary">#3F51B5</color>
	    <color name="colorPrimaryDark">#303F9F</color>
	    <color name="colorAccent">#FF4081</color>

	    <color name="primary">#E43F3F</color>
	    <color name="primary_dark">#E12929</color>
	    <color name="primary_darker">#CC1D1D</color>
	    <color name="accent">#FFFFFF</color>

	    <color name="black">#000000</color>
	    <color name="jet">#222222</color>
	    <color name="oil">#333333</color>
	    <color name="monsoon">#777777</color>
	    <color name="jumbo">#888888</color>
	    <color name="aluminum">#999999</color>
	    <color name="base">#AAAAAA</color>
	    <color name="iron">#CCCCCC</color>
	    <color name="white">#FFFFFF</color>

	</resources>

    - styles.xml
	<resources>

	    <!-- Base application theme. -->
	    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
		<!-- Customize your theme here. -->
		<item name="colorPrimary">@color/colorPrimary</item>
		<item name="colorPrimaryDark">@color/colorPrimaryDark</item>
		<item name="colorAccent">@color/colorAccent</item>
	    </style>

	    <style name="AppTheme.Dark.Dialog" parent="Theme.AppCompat.Dialog">
		<item name="colorAccent">@color/white</item>
		<item name="android:textColorPrimary">@color/iron</item>
		<item name="android:background">@color/primary</item>
	    </style>
	</resources>


http://www.android-app-patterns.com/category/login-screens

# SIGNUPFACEBOOKAPP
- Project: 
- Description: 
- Trick: 

    - Choose drawable => choose New/Drawable Resource Files/rounded_edittext.xml

	<?xml version="1.0" encoding="utf-8"?>
	<selector xmlns:android="http://schemas.android.com/apk/res/android">
	    <item>
		<shape android:shape="rectangle">
		    <solid android:color="@color/AliceBlue"></solid>
		    <stroke android:color="@color/Aquamarine"></stroke>
		    <corners android:radius="15dp"></corners>
		</shape>
	    </item>
	</selector>

	<?xml version="1.0" encoding="utf-8"?>
	<shape xmlns:android="http://schemas.android.com/apk/res/android"
	android:shape="rectangle" >
		<!-- Màu nền -->
		<solid android:color="#ffffff" >
		</solid>
		<!-- độ rộng viền và màu -->
		<stroke
		android:width="1dp"
		android:color="#5b607e" >
		</stroke>
		<!-- chỗ nào set padding -->
		<padding
		android:bottom="1dp"
		android:left="1dp"
		android:right="1dp"
		android:top="1dp" >
		</padding>
		<!-- chỗ này set độ cong góc -->
		<corners android:radius="0dp" >
		</corners>
	</shape>

    - Insert image left of EditText
    - Access URL: https://icons8.com/web-app/for/all/mail
    - Access URL: https://www.iconfinder.com




