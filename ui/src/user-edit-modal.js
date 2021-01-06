import React, { useState } from 'react';
import { View, Text, Modal, StyleSheet, TextInput, Button } from 'react-native';

import { connect } from "react-redux";
import actions from "./store/actions";

const UserEditModal = (props) => {
  const {visible, index, user, stopEdit} = props;
  return (
    <Modal
      animationType="fade"
      transparent={true}
      visible={visible}
      onRequestClose={() => {
        console.log("modal close");
      }}
    >
      <View style={styles.centeredView}>
        <View style={styles.modalView}>
          <Text style={styles.modalText}>edit user</Text>
            <View style={styles.formRow}>
            <Text style={styles.formText}>Title</Text>
            <TextInput
              style={styles.formText}
              placeholder={"Title"}
              value={user.name.title}
              onChange={e => {
                props.editUser({ ...user, name: { ...user.name, title: e.target.value} })
              }}
            />
          </View>
          <View style={styles.formRow}>
            <Text style={styles.formText}>First Name</Text>
            <TextInput
              style={styles.formText}
              placeholder={"First name"}
              value={user.name.first}
              onChange={e => {
                props.editUser({ ...user, name: { ...user.name, first: e.target.value} })
              }}
            />
          </View>
          <View style={styles.formRow}>
            <Text style={styles.formText}>Last Name</Text>
            <TextInput
              style={styles.formText}
              placeholder={"Last name"}
              value={user.name.last}
              onChange={e => {
                props.editUser({ ...user, name: { ...user.name, last: e.target.value} })
              }}
            />
          </View>
          <View style={styles.formRow}>
            <Text style={styles.formText}>Email</Text>
            <TextInput
              style={styles.formText}
              placeholder={"Email"}
              value={user.email}
              onChange={e => {
                props.editUser({ ...user, email: e.target.value })
              }}
            />
          </View>
          <Button
            title="Done"
            style={styles.openButton}
            onPress={()=>{stopEdit(index, {
              ...user
            })}}
          >
          </Button>
        </View>
      </View>
    </Modal>
  );
}

const styles = StyleSheet.create({
  centeredView: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    // marginTop: 0,
    backgroundColor: 'rgba(0, 0, 0, 0.5)'
  },
  modalView: {
    margin: 20,
    backgroundColor: "white",
    borderRadius: 20,
    padding: 35,
    alignItems: "center",
    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 2
    },
    shadowOpacity: 0.25,
    shadowRadius: 3.84,
    elevation: 5
  },
  openButton: {
    backgroundColor: "#F194FF",
    borderRadius: 20,
    padding: 10,
    elevation: 2
  },
  textStyle: {
    color: "white",
    fontWeight: "bold",
    textAlign: "center"
  },
  modalText: {
    marginBottom: 15,
    textAlign: "center"
  },
  modalInput: {
    borderColor: 'gray',
    borderWidth: 1
  },
  formText: {
      width: 200,
  },
  formRow: {
    flex: 1,
    padding: 5,
    flexDirection: 'row'
  }
});

const mapStateToProps = state => ({
  editingUserData: state.users.editingUserData
});

const mapDispatchToProps = dispatch => ({
  editUser: (data) => dispatch(actions.editUser(data))
});

export default connect(mapStateToProps, mapDispatchToProps)(UserEditModal);
