package rriskhh.start.medic;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by rriskhh on 06/06/16.
 */
public class ExapandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> head_list;
    private HashMap<String,List<String>> item_list;
    public ExapandableListAdapter(Context context, List<String> head_list, HashMap<String,List<String>> item_list){
        this.context = context;
        this.head_list = head_list;
        this.item_list = item_list;
    }
    @Override
    public int getGroupCount() {
        return this.head_list.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.item_list.get(this.head_list.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.head_list.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.item_list.get(this.head_list.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }
        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.header);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item, null);
        }

        final TextView txtListChild = (TextView) convertView
                .findViewById(R.id.item);

        ImageView iv = (ImageView) convertView.findViewById(R.id.plus);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!SymptomChecker.arrayList.contains(childText)) {
                    SymptomChecker.arrayList.add(childText);
                    txtListChild.setTextColor(Color.RED);
                }
            }
        });

        txtListChild.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
