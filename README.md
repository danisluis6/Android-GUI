# LOGINFACEBOOKAPP
- Project: 
- Description: XML
- Trick: ExRecycle to custom ListView following personal

    - Basic Login Application Facebook. 
    <?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:background="@color/bgFB">
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:gravity="center"
		android:layout_marginTop="30dp"
		android:text="facebook"
		android:textStyle="bold"
		android:textSize="60dp"
		android:textColor="@color/titleFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="120dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Email"
		android:textSize="15dp"
		android:background="@color/emailFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="180dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Password"
		android:textSize="15dp"
		android:background="@color/passFB"/>

	    <Button
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:padding="12dp"
		android:text="Login"
		android:textColor="@color/btnLogin"
		android:background="@color/bgLogin"
		android:layout_marginTop="240dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		/>
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:text="@string/SignUpForFacebook"
		android:gravity="center"
		android:textSize="18dp"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="430dp"/>
	    <Button
		android:layout_width="40dp"
		android:layout_height="40dp"
		android:layout_centerHorizontal="true"
		android:text="\?"
		android:padding="0dp"
		android:textSize="30dp"
		android:textStyle="bold"
		android:background="@color/bgLogin"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="460dp"/>
	</RelativeLayout>

![alt tag](https://github.com/danisluis6/GUI/blob/master/LoginFacebookApp/1.png)

    - Basic Login Application Facebook. Only input data into one line. 
    <?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:background="@color/bgFB">
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:gravity="center"
		android:layout_marginTop="30dp"
		android:text="facebook"
		android:textStyle="bold"
		android:textSize="60dp"
		android:textColor="@color/titleFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="120dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Email"
		android:textSize="15dp"
		android:background="@color/emailFB"
		android:lines="1"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="180dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Password"
		android:textSize="15dp"
		android:background="@color/passFB"
		android:lines="1"/>

	    <Button
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:padding="12dp"
		android:text="Login"
		android:textColor="@color/btnLogin"
		android:background="@color/bgLogin"
		android:layout_marginTop="240dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		/>
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:text="@string/SignUpForFacebook"
		android:gravity="center"
		android:textSize="18dp"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="430dp"/>
	    <Button
		android:layout_width="40dp"
		android:layout_height="40dp"
		android:layout_centerHorizontal="true"
		android:text="\?"
		android:padding="0dp"
		android:textSize="30dp"
		android:textStyle="bold"
		android:background="@color/bgLogin"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="460dp"/>
	</RelativeLayout>

# LOGIN
- Project: Login01
- Description: XML
- Trick: ExRecycle to custom ListView following personal

    - Tutorials instruction login beautiful xml with android
    - This is a picture and you draw picture into file xml

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


