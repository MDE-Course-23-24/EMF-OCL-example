/**
 */
package Juri.impl;

import Juri.Book;
import Juri.JuriPackage;
import Juri.Library;
import Juri.Loan;
import Juri.Member;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Juri.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link Juri.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link Juri.impl.LibraryImpl#getLoans <em>Loans</em>}</li>
 *   <li>{@link Juri.impl.LibraryImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * The cached value of the '{@link #getLoans() <em>Loans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoans()
	 * @generated
	 * @ordered
	 */
	protected EList<Loan> loans;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JuriPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JuriPackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectContainmentWithInverseEList<Book>(Book.class, this, JuriPackage.LIBRARY__BOOKS, JuriPackage.BOOK__LIBRARY);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Loan> getLoans() {
		if (loans == null) {
			loans = new EObjectContainmentEList<Loan>(Loan.class, this, JuriPackage.LIBRARY__LOANS);
		}
		return loans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member>(Member.class, this, JuriPackage.LIBRARY__MEMBERS, JuriPackage.MEMBER__LIBRARY);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JuriPackage.LIBRARY__BOOKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooks()).basicAdd(otherEnd, msgs);
			case JuriPackage.LIBRARY__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JuriPackage.LIBRARY__BOOKS:
				return ((InternalEList<?>)getBooks()).basicRemove(otherEnd, msgs);
			case JuriPackage.LIBRARY__LOANS:
				return ((InternalEList<?>)getLoans()).basicRemove(otherEnd, msgs);
			case JuriPackage.LIBRARY__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JuriPackage.LIBRARY__NAME:
				return getName();
			case JuriPackage.LIBRARY__BOOKS:
				return getBooks();
			case JuriPackage.LIBRARY__LOANS:
				return getLoans();
			case JuriPackage.LIBRARY__MEMBERS:
				return getMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JuriPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case JuriPackage.LIBRARY__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
			case JuriPackage.LIBRARY__LOANS:
				getLoans().clear();
				getLoans().addAll((Collection<? extends Loan>)newValue);
				return;
			case JuriPackage.LIBRARY__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JuriPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JuriPackage.LIBRARY__BOOKS:
				getBooks().clear();
				return;
			case JuriPackage.LIBRARY__LOANS:
				getLoans().clear();
				return;
			case JuriPackage.LIBRARY__MEMBERS:
				getMembers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JuriPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JuriPackage.LIBRARY__BOOKS:
				return books != null && !books.isEmpty();
			case JuriPackage.LIBRARY__LOANS:
				return loans != null && !loans.isEmpty();
			case JuriPackage.LIBRARY__MEMBERS:
				return members != null && !members.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
