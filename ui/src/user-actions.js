import React from "react";
import { View, TouchableHighlight, Text, Alert, StyleSheet } from "react-native";

import actions from "./store/actions";

const UserActions = ({ index, item, deleteUser, startEdit }) => {
  return (
    <View style={styles.actionsContainer}>
      <TouchableHighlight
        style={styles.actionButton}
        onPress={() => {
          startEdit(index, item);
        }}
      >
        <Text style={styles.actionButtonText}>Edit</Text>
      </TouchableHighlight>
      <TouchableHighlight
        style={[styles.actionButton, styles.actionButtonDestructive]}
        onPress={() => {
          deleteUser(index);
        }}
      >
        <Text style={styles.actionButtonText}>Remove</Text>
      </TouchableHighlight>
    </View>
  );
};

const styles = StyleSheet.create({
  actionsContainer: {
    flex: 1,
    flexDirection: "row",
    justifyContent: "flex-end",
    alignItems: "center",
    padding: 10
  },
  actionButton: {
    padding: 10,
    color: "white",
    borderRadius: 6,
    width: 80,
    backgroundColor: "#808080",
    marginRight: 5,
    marginLeft: 5
  },
  actionButtonDestructive: {
    backgroundColor: "#ff4b21"
  },
  actionButtonText: {
    textAlign: "center"
  }
});

export default UserActions;
