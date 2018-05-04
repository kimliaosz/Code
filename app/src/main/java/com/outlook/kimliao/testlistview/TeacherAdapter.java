package com.outlook.kimliao.testlistview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TeacherAdapter extends ArrayAdapter<Teacher> {
    public TeacherAdapter(Context context, int resource, List<Teacher> objects) {
        super(context, resource, objects);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final Teacher teacher = getItem(position);
        View oneTeacherView = LayoutInflater.from(getContext()).inflate(R.layout.teacher_item, parent,false);
        ImageView imageView = (ImageView) oneTeacherView.findViewById(R.id.teacher_small_imageView);
        TextView  testView = (TextView) oneTeacherView.findViewById(R.id.teacher_name_textView);
        imageView.setImageResource(teacher.getImageID());
        testView.setText(teacher.getName());
        oneTeacherView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(teacher.getName().equals("廖家琦")){
                    Intent intent = new Intent(getContext(), MySurfaceViewActivity.class);
                    getContext().startActivity(intent);
                }else{
                    Intent intent = new Intent(getContext(), TeacherDetailActivity.class);
                    intent.putExtra("TeacherImage", teacher.getImageID());
                    intent.putExtra("TeacherDescription", teacher.getDescription());
                    getContext().startActivity(intent);
                }
            }
        });
        return oneTeacherView;
    }
}
