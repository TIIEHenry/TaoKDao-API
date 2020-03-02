package androcode.api.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;

import java.util.List;

/**
 * @author TIIEHenry
 */
public abstract class BaseSpinnerAdapter<T> extends BaseAdapter implements SpinnerAdapter {
	private List<T> dataList;


	public BaseSpinnerAdapter(List<T> dataList) {
		super();
		this.dataList = dataList;
	}

	/*@Override
	public abstract int getItemViewType(int position)
  */
	public abstract ViewHolder<T> onCreateViewHolder(ViewGroup parent, int pos);

	public abstract ViewHolder<T> onCreateDropDownViewHolder(ViewGroup parent, int pos);


	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> data) {
		dataList.clear();
		dataList.addAll(data);
		notifyDataSetChanged();
	}

	public int getItemCount() {
		return dataList.size();
	}

	public void add(T data) {
		dataList.add(data);
		notifyDataSetChanged();
	}

	public void add(int pos, T data) {
		dataList.add(pos, data);
		notifyDataSetChanged();
	}

	public void remove(T data) {
		dataList.remove(data);
		notifyDataSetChanged();
	}

	public void remove(int pos) {
		dataList.remove(pos);
		notifyDataSetChanged();
	}

	public void clear() {
		dataList.clear();
		notifyDataSetChanged();
	}

	protected abstract void bindData(ViewHolder<T> holder, T data, /*int type,*/ int pos);

	protected abstract void bindDropDownData(ViewHolder<T> holder, T data, /*int type,*/ int pos);

	@Override
	public int getCount() {
		return dataList.size();
	}

	@Override
	public T getItem(int position) {
		return dataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder<T> holder = onCreateViewHolder(parent, position);
		T data = dataList.get(position);
		holder.setData(data);
		bindData(holder, data, position);
		holder.getRootView().setTag(holder);
		return holder.getRootView();
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		ViewHolder<T> holder = onCreateDropDownViewHolder(parent, position);
		T data = dataList.get(position);
		holder.setData(data);
		bindDropDownData(holder, data, position);
		holder.getRootView().setTag(holder);
		return holder.getRootView();
	}


	public static class ViewHolder<T> {

		// SparseArray 比 HashMap 更省内存，在某些条件下性能更好，只能存储 key 为 int 类型的数据，
		// 用来存放 View 以减少 findViewById 的次数
		private SparseArray<View> viewSparseArray;

		private View rootView;
		private T data;


		public ViewHolder(View itemView) {
			rootView = itemView;
			viewSparseArray = new SparseArray<>();
		}

		public void setData(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public View getView(int viewId) {
			// 先从缓存中找，找打的话则直接返回
			// 如果找不到则 findViewById ，再把结果存入缓存中
			View view = viewSparseArray.get(viewId);
			if (view == null) {
				view = getRootView().findViewById(viewId);
				viewSparseArray.put(viewId, view);
			}
			return view;
		}

		public View getRootView() {
			return rootView;
		}


	}
}

