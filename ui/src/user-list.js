import React from "react";
import { SwipeableFlatList } from "react-native-swipeable-lists";
import UserItem from "./user-item";
import UserActions from "./user-actions";

const UserList = ({ users, deleteUser, startEdit }) => {
  return (
    <SwipeableFlatList
      data={users}
      bounceFirstRowOnMount={true}
      keyExtractor={(item, index) => index.toString()}
      maxSwipeDistance={160}
      renderItem={UserItem}
      renderQuickActions={
        (item) => <UserActions
        index={item.index}
        item={item.item}
        deleteUser={deleteUser}
        startEdit={startEdit}
        />
      }
    />
  );
};

export default UserList;
